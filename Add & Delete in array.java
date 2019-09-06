import javax.swing.JOptionPane;
public class Linear_Binary_Search {

 public static void main(String[] args) {
String s;
     JOptionPane.showMessageDialog(null ,"\n\n           _-_-  WELCOME TO THIS PROGRAM  -_-_  \n\n\n");
            int n;
            int i,j;

int max = 100;
           int[] a = new int[max];

        s= JOptionPane.showInputDialog("The size of your array is>>>");
        n = Integer.parseInt(s);

            for(i=0; i<n; i++)
            {

                s= JOptionPane.showInputDialog(i+1+"_th element is>>>");
                a[i] = Integer.parseInt(s);
            }

            int p;
            
        JOptionPane.showMessageDialog(null ,"Choose Your Option>>>\n");

        JOptionPane.showMessageDialog(null ,"1.***Insert***\n2.***Delete***\n3.***Sort***\n\n");
        s= JOptionPane.showInputDialog("Press the key>>>");
        p = Integer.parseInt(s);

            if(p==1)
            {
                int index,item;

                s= JOptionPane.showInputDialog("The index of the array where you want to insert>>>");
                index  = Integer.parseInt(s);

                s= JOptionPane.showInputDialog("The value of your insertion's index>>>");

                item  = Integer.parseInt(s);

                for(j=n-1; j>=index; j--)
                {
                    a[j+1]=a[j];
                }
                a[index]=item;

                n=n+1;
                for(i=0; i<n; i++)
                {
                    JOptionPane.showMessageDialog(null ,i+1+"_th element is::: "+a[i]);
                }
            }
            else if(p==2)
            {
                int index,item;

                s= JOptionPane.showInputDialog("The index of the array where you want to delete>>");
               index = Integer.parseInt(s);
                n=n-1;

                for(j=index; j<n; j++)
                {
                    a[j]=a[j+1];

                }


                for(i=0; i<n; i++)
                {
                    s= JOptionPane.showInputDialog(i+1+"_th element is::: "+a[i]);
   a[i]= Integer.parseInt(s);
                }
            }

            else if(p==3)
            {
                int temp;
                int g;

                for(i=0; i<n; i++)
                {
                    for(j=0; j<n-i-1; j++){
                       if(a[j]>a[j+1]) {
                       
                             temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
                    s= JOptionPane.showInputDialog("%d th Step::::\n",i+1);

                    for(g=0; g<n; g++)
                    {
                    JOptionPane.showMessageDialog(null ,i+1+"_th element is::: "+a[g]);

                    }
                }
            }

        }
    }

