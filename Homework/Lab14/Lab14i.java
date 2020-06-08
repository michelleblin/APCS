public class Lab14i
{
  public static void main(String[] args) {
    System.out.println(decimalToRoman(49));
    System.out.println(decimalToRoman(3547));

    System.out.println(romanToDecimal("XLIX"));
    System.out.println(romanToDecimal("XXXVIII"));
    System.out.println(romanToDecimal("LXXVII"));

  }

  public static String decimalToRoman(int num)
  {
    int[] decNums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanNums = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    String roman = "";

    for(int i=0; i<decNums.length; i++)
    {
      while(num >= decNums[i])
      {
        roman += romanNums[i];
        num -= decNums[i];
      }
    }

    return roman;
  }

  public static int romanToDecimal(String roman)
  {
    int[] decNums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanNums = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    int num = 0;
    int curr = 0;
    for(int i=0; i<romanNums.length; i++)
    {
      while(curr<roman.length() && (romanNums[i].equals(roman.substring(curr, curr+1)) || romanNums[i].equals(roman.substring(curr, curr+2))))
      {
        num += decNums[i];
        if(curr < roman.length()-1 && romanNums[i].equals(roman.substring(curr, curr+2)))
          curr++;
        curr++;
      }
    }
    return num;
  }
}
