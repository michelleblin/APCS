public class Tester
{
  public static void main(String[] args) {
    APcsStudent tina = new LazyButtTina("Tina", "Chen", "lowkey I'm so dumb");  
    APcsStudent chloe = new QuietChloe("Chloe", "Cheng", "uh...I'm...uh...Chloe", "SiTong");
    APcsStudent kyra = new IntelligentKyra("Kyra", "Yee", "...well the force of gravity acts on the ball causing it to...");  
    APcsStudent kaleen = new DumDumKaleen("Kaleen", "Chen" , "I'm smarter than all you people ;)");
    
    APcsStudent[] students = {tina, chloe, kyra, kaleen};
    for(APcsStudent student:students)
    {
        student.speak();
    }
  }
}
