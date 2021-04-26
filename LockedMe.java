import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

class LockedMe
        {
            static File root=new File("C:\\Users\\Lenovo\\Desktop\\New folder");
        public static void main(String[] args)

        {
                System.out.println("\nProject Name :- LockedMe.com");
                System.out.println("Project developed by :- Debasish Pujapanda");
                
                System.out.println("\nRoot Directory:- "+root);
                
            while(true)
            {
            System.out.println("\n1. Show the files in Ascending Order");
            System.out.println("2. Business-level operations");
            System.out.println("3. Close the Application");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
               if(choice==1)
                  {
                      File[] fileascending=root.listFiles();
                      Arrays.sort(fileascending);
                       if(fileascending.length==0)
                      System.out.println("Root folder is an empty directory");
                       else
                              {
                               System.out.println("List of files are :-");
                               for(File e:fileascending)
                               System.out.println(e.getName());
                               }
                   }
               else if(choice==2)
                   {
                    }
              else if(choice==3)
                    {
                        System.out.println("Thank you");
                        System.exit(0);
                       }
                 else
                  {
                      System.out.println("Invalid Input");
                   }
             }
        }
        }
