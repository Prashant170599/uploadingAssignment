
class Computer
{
public void hello()
{
System.out.println("Hello Computer");
}
}
class Monitor extends Computer
{
 public void monitor()
 {
  System.out.println("Hello Monitor");
 }
}
class Keyboard extends Computer
{
 public void keyboard()
 {
  System.out.println("Hello Keyboard");
 }
}
class Mouse extends Computer
{
 public void mouse()
 {
  System.out.println("Hello Mouse");
 }
}
class CPU extends Computer
{
 public void Cpu()
 {
  System.out.println("Hello CPU");
 }
}

public class ComputerMain {
 public static void main(String[] args)
 {

  Computer c=new Computer();
  Monitor d=new Monitor();
  CPU s=new CPU();
  Keyboard k=new Keyboard();
  k.keyboard();
  s.Cpu();
  d.monitor();
  c.hello();
 }

}
