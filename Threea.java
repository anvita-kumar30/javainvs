public class Threea 
{
    string name;
    int roll;
    string branch;
    float pointer;
void getStudent()throws IOException 
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    System.out.println("Enter Student Name: ");
    name = br.readLine();
    System.out.println("Enter Roll Number: ");
    roll = Integer.parseInt(br.readLine());
    System.out.println("Enter Branch: ");
    branch = br.readLine();
    System.out.println("Enter Pointer: ");
    pointer = Float.parseFloat(br.readLine());
}
void putStudent() 
{
    System.out.print("\n**** Student Details ****\n" );
    System.out.print("\nStudent Name: " + name);  
    System.out.print("\nRoll Number: " + roll);
    System.out.print("\nCollege Name: " + branch);
    System.out.print("\nUniversity Name: " + pointer);
}
public static void main(String args[])throws IOException 
{
    Student s = new Student();
    s.getStudent();
    s.putStudent();
}
}

