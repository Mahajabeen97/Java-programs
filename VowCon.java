
import java.util.Scanner;

class VowCon
{
  public static void main(String[] args)
 {
int alphabet;
 Scanner in=new Scanner(System.in);
 alphabet=in.next().charAt(0);
 System.out.println("+alphabet");
 if(alphabet='a'||alphabet='e'||alphabet='i'||alphabet='o'|| alphabet='u')

  System.out.println("Vowel");
 if(alphabet='b'||alphabet='c'||alphabet='d'||alphabet='f'||alphabet='g'||alphabet='h'||alphabet='j'||alphabet='k'||alphabet='l'||alphabet='m'||
  alphabet='n'||alphabet='p'||alphabet='q'||alphabet='r'||alphabet='s'||alphabet='t'||alphabet='v'||alphabet='w'||alphabet='x'||alphabet='y'||alphabet='z')
    System.out.println("Consonant");
    else
      System.out.println("Invalid");
      
      
 }
  }
