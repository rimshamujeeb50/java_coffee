import java.io.*;
//import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

class Project extends JFrame{

    Project() throws IOException{
    JFrame jf1,jf2,jf3,jf4,jf5;
    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb9,e,jb0,jb01,jb7,jb8,jb10,jb11,jb12;  
    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,el,jl117,jl20,jl21,jl22,jl23,jl24;

    jf1=new JFrame("Cafe Recommendation");
    jf2=new JFrame("Cafe Recommendation");
    jf3=new JFrame("Cafe Recommendation-visitor view");
    jf4=new JFrame("STARBUCKS");
    jf5=new JFrame("BUBBLES");

    jl5=new JLabel("WELCOME CAFE OWNERS");
    jl6=new JLabel("please Select Your Cafe!!!");
    jl7=new JLabel("1.  Starbucks");
    jb3=new JButton("click me");
    jl8=new JLabel("2.  Bubbles");
    jb4=new JButton("click me");
    jl21=new JLabel("3.  HomePage");
    jb10=new JButton("Back");
    jl10=new JLabel("USERNAME :");
    jt2=new JTextField(20); 
    jl11=new JLabel("PASSWORD :");
    jt3=new JTextField(20);
    jb6=new JButton("submit");
    jl19=new JLabel("displays valid or invalid");
    jl12=new JLabel("Enter the menu to add");
    jt4=new JTextField(20);
    jl13=new JLabel("sucessful!!");
    jb0=new JButton("ADD");
    jl14=new JLabel("USERNAME :");
    jt5=new JTextField(20); 
    jl15=new JLabel("PASSWORD :");
    jt6=new JTextField(20); 
    jb9=new JButton("submit"); 
    jl18=new JLabel("displays valid or invalid");
    jl16=new JLabel("Enter the menu to add");
    jt7=new JTextField(20);
    jb01=new JButton("ADD");
    jl9=new JLabel("ENTER THE MENU U WISH TO HAVE:");
    jt1=new JTextField(200);
    jb5=new JButton("Search");
    jl17=new JLabel("item in starbucks add:hanamkonda chowrasta");
    jl117=new JLabel("item in BUBBLES address@:warangal chowrasta");
    jl20=new JLabel("WELCOME TO VISITORS PAGE.");
    jb7=new JButton("Back");
    jb8=new JButton("Refresh");
    jl22=new JLabel("WELCOME TO STARBUCKS.YUMMY YUMMY COFFEE!!!");
    jl23=new JLabel("enter credentials...");
    jb11=new JButton("Back");
    jl24=new JLabel("WELCOME TO BUBBLES.DELICIOUS SNACKS!!!");
    jb12=new JButton("Back");


    jl1=new JLabel("WELCOME TO JAVA CREATIONS");//HOMEPAGE STARTS
    jl1.setFont(new Font("Verdana",Font.BOLD,30));
    jl1.setBounds(200,0,650,150);
    jf1.add(jl1);

    jl2=new JLabel("WHO YOU ARE? SELECT YOUR ROLE!!!");//label creation.
    jl2.setBounds(200,100,800,150);
    jl2.setFont(new Font("Verdana",Font.PLAIN,20));
    jf1.add(jl2);

    jl3=new JLabel("1.  Cafe Owner ");
    jl3.setBounds(200,200,260,80);
    jl3.setFont(new Font("Verdana",Font.PLAIN,16));
    jf1.add(jl3);

    jb1=new JButton("click me");
    jb1.setBounds(380,230,100,40);
    jf1.add(jb1);

    jl4=new JLabel("2.  Visitor   ");
    jl4.setBounds(200,300,260,80);
    jl4.setFont(new Font("Verdana",Font.PLAIN,16));
    jf1.add(jl4);

    jb2=new JButton("click me");
    jb2.setBounds(380,310,100,40);
    jf1.add(jb2);
      
    el=new JLabel("3.   EXIT  ");
    el.setBounds(200,370,260,80);
    el.setFont(new Font("Verdana",Font.PLAIN,16));
    jf1.add(el);

    e=new JButton("click me");
    e.setBounds(380,380,100,40);
    jf1.add(e);

    jf1.getContentPane().setBackground(Color.PINK);
    jf1.setSize(1500,1500);
    jf1.setLayout(null);
    jf1.setVisible(true);

    //CAFE OWNERS
    jb1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            jf1.setVisible(false);  
            
            //jl5=new JLabel("WELCOME CAFE OWNERS");
            jl5.setFont(new Font("Verdana",Font.BOLD,30));
            jl5.setBounds(200,0,650,150);
            jf2.add(jl5);
     
            //jl6=new JLabel("Please Select Your Cafe!!!");
            jl6.setBounds(200,100,800,150);
            jl6.setFont(new Font("Verdana",Font.PLAIN,20));
            jf2.add(jl6);
     
            //jl7=new JLabel("1.Starbucks");
            jl7.setBounds(200,200,260,80);
            jl7.setFont(new Font("Verdana",Font.PLAIN,16));
            jf2.add(jl7);
     
            //jb3=new JButton("click me");
            jb3.setBounds(380,230,100,40);
            jf2.add(jb3);
     
            //jl8=new JLabel("2.Bubbles");//label creation.
            jl8.setBounds(200,300,260,80);
            jl8.setFont(new Font("Verdana",Font.PLAIN,16));
            jf2.add(jl8);
     
            //jb4=new JButton("click me");
            jb4.setBounds(380,310,100,40);
            jf2.add(jb4);

            //jl21=new JLabel("3. homepage");//label creation.
            jl21.setBounds(200,370,260,80);
            jl21.setFont(new Font("Verdana",Font.PLAIN,16));
            jf2.add(jl21);
           
            jb10.setBounds(380,400,100,40);
            jf2.add(jb10);

            jf2.getContentPane().setBackground(Color.PINK);
            jf2.setSize(1500,1500);//window size
            jf2.setLayout(null);
            jf2.setVisible(true);

            jb10.addActionListener(new ActionListener(){   
                public void actionPerformed(ActionEvent ae){
                            jf2.setVisible(false);
                            jf1.setVisible(true);
                }});

            // cafe 1 append start
            jb3.addActionListener(new ActionListener(){   ///cafe 1 append
                public void actionPerformed(ActionEvent ae){
                         jf2.setVisible(false);
                        //in 4th frame 

                        jl22.setFont(new Font("Serif",Font.ITALIC,30));
                        jl22.setBounds(200,0,750,150);
                        jf4.add(jl22);

                        jl23.setFont(new Font("serif",Font.PLAIN,25));
                        jl23.setBounds(200,70,750,120);
                        jf4.add(jl23);


                        // jl10=new JLabel("USERNAME :");
                        jl10.setBounds(200,150,260,80);
                        jl10.setFont(new Font("Verdana",Font.PLAIN,16));
                         jf4.add(jl10); 
                         
                         //jt2=new JTextField(20); 
                         jt2.setBounds(380,170,100,40);
                         jf4.add(jt2);

                         //jl11=new JLabel("PASSWORD :");
                         jl11.setBounds(200,200,260,80);
                         jl11.setFont(new Font("Verdana",Font.PLAIN,16));
                         jf4.add(jl11); 
                         
                         //jt3=new JTextField(20); 
                         jt3.setBounds(380,220,100,40);
                         jf4.add(jt3);

                         //jb6=new JButton("submit"); 
                         jb6.setBounds(200,280,100,45); 
                         jf4.add(jb6);

                         jb11.setBounds(330,280,100,45); 
                         jf4.add(jb11);

                         //jl19=new JLabel("displays valid or invalid");
                         jl19.setBounds(250,320,200,85); 
                         jl19.setFont(new Font("Verdana",Font.PLAIN,14));
                         jf4.add(jl19);

                         jf4.getContentPane().setBackground(Color.LIGHT_GRAY);
                         jf4.setLayout(null);
                         jf4.setSize(1500,1500);//window size
                         jf4.setVisible(true);

                         jb11.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                                         jf4.setVisible(false);
                                         jf2.setVisible(true);

                            }});

                         jb6.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                               String s1="Rimsha";
                               String n2="VAlid Credentials";
                               String n3="invalid Credentials";
                               int n5=1013;
                               String n1= jt2.getText();
                               int n4=Integer.parseInt(jt3.getText());
                               if((n1.equals(s1))&&(n4==n5)){
                                    jl19.setText(n2);
                                    
                                    //jl12=new JLabel("Enter the menu to add");
                                    jl12.setBounds(210,380,220,80);
                                    jl12.setFont(new Font("Verdana",Font.PLAIN,16)); 
                                    jf4.add(jl12); 
                                       
                                    //jt4=new JTextField(20); 
                                    jt4.setBounds(400,400,150,40);
                                    jf4.add(jt4);

                                    jb0.setBounds(300,460,100,40);
                                    jf4.add(jb0);

                                    jb0.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent ae){
   
                                          String item=jt4.getText();
                                       try
                                       {
                                                   String filePath = "starbucks.txt";
                                                   FileWriter fw = new FileWriter(filePath, true);    
                                                   String lineToAppend ="\nitem:"+item;
                                                   fw.write(lineToAppend);
                                                   fw.close();
                                                   jl13.setBounds(410,440,200,85); 
                                                   jf4.add(jl13);
   
                                       }
                                       catch(Exception e)
                                       {
                                           System.out.println(e.getMessage());
                                       }    
                                      }});
                                                   }
                                                   
                                         //file append code here c1file
                               else
                               {
                                   jl19.setText(n3);
                               }
                               
                               } 
                            });
                }});
                //cafe 1 append finish

                 //cafe 2 append start
                 jb4.addActionListener(new ActionListener(){   ///cafe 2 append
                    public void actionPerformed(ActionEvent ae){
                             jf2.setVisible(false);
                            //in 5th frame 

                            jl24.setFont(new Font("Serif",Font.ITALIC,30));
                            jl24.setBounds(200,0,750,150);
                            jf5.add(jl24);

                            jl23.setFont(new Font("serif",Font.PLAIN,25));
                            jl23.setBounds(200,70,750,120);
                            jf5.add(jl23);

                            // jl14=new JLabel("USERNAME :");
                             jl14.setBounds(200,150,260,80);
                             jl14.setFont(new Font("Verdana",Font.PLAIN,16));
                             jf5.add(jl14); 
                             
                             //jt5=new JTextField(20); 
                             jt5.setBounds(380,170,100,40);
                             jf5.add(jt5);
    
                             //jl15=new JLabel("PASSWORD :");
                             jl15.setBounds(200,200,260,80);
                             jl15.setFont(new Font("Verdana",Font.PLAIN,16)); 
                             jf5.add(jl15); 
                             
                             //jt6=new JTextField(20); 
                             jt6.setBounds(380,220,100,40);
                             jf5.add(jt6);
    
                             //jb9=new JButton("submit"); 
                             jb9.setBounds(200,280,100,45); 
                             jf5.add(jb9);

                             jb12.setBounds(330,280,100,45); 
                             jf5.add(jb12);
    
                             //jl11=new JLabel("displays valid or invalid");
                             jl18.setBounds(250,320,200,85); 
                             jl18.setFont(new Font("Verdana",Font.PLAIN,14));
                             jf5.add(jl18); 
       
                             jf5.getContentPane().setBackground(Color.CYAN);
                             jf5.setSize(1000,1000);//window size
                             jf5.setLayout(null);
                             jf5.setVisible(true);

                             jb12.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae){
                                             jf5.setVisible(false);
                                             jf2.setVisible(true);
    
                                }});

                             jb9.addActionListener(new ActionListener(){
                             public void actionPerformed(ActionEvent ae){
                                String ss1="Finza";
                                String nn2="Valid Credentials";
                                String nn3="invalid Credentials";
                                int nn5=1019;
                                String nn1= jt5.getText();
                                int nn4=Integer.parseInt(jt6.getText());
                                if((nn1.equals(ss1))&&(nn4==nn5)){
                                     jl18.setText(nn2);

                                     //jl16=new JLabel("Enter the menu to add");
                                     jl16.setBounds(210,380,220,80);
                                     jl16.setFont(new Font("Verdana",Font.PLAIN,16)); 
                                     jf5.add(jl16); 
                                        
                                     //jt7=new JTextField(20); 
                                     jt7.setBounds(400,400,150,40); 
                                     jf5.add(jt7);

                                     jb01.setBounds(300,460,100,40);
                                     jf5.add(jb01);

                                     jb01.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent ae){
    
                                        String item=jt4.getText();
                                        try
                                        {
                                                    String filePath = "bubbles.txt";
                                                    FileWriter fw = new FileWriter(filePath, true);    
                                                    String lineToAppend ="\nitem:"+item;
                                                    fw.write(lineToAppend);
                                                    fw.close();
                                                    jl13.setBounds(410,440,200,85); 
                                                    jf5.add(jl13);
                                        }
                                        catch(Exception e)
                                        {
                                            System.out.println(e.getMessage());
                                        } 
                                    }});
                                                    }
                                                    
                                          //file append code here c1file
                                else
                                {
                                    jl18.setText(nn3);
                                }
                                
                                } 
                             });
                                         
                    }
                });

                 //cafe2 finish
         }
     });

     //-----------------visitor section starts--------------------------
     jb2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            jf1.setVisible(false);
            jf2.setVisible(false);
            

           // jl20=new JLabel("WELCOME VISITORS");
            jl20.setFont(new Font("Verdana",Font.BOLD,30));
            jl20.setBounds(200,0,650,150);
            jf3.add(jl20);

             //jl9=new JLabel("ENTER THE MENU U WISH TO HAVE:");
             jl9.setBounds(200,100,800,150);
             jl9.setFont(new Font("Verdana",Font.PLAIN,20));
             jf3.add(jl9);
     
           // jt1=new JTextField(20);
            jt1.setBounds(250,230,500,45);
            jf3.add(jt1);
     
           // jb5=new JButton("Search");
            jb5.setBounds(260,280,100,40);
            jf3.add(jb5);

            // jb7=new JButton("Back");
            jb7.setBounds(420,280,100,40);
            jf3.add(jb7);

             // jb8=new JButton("Refresh");
             jb8.setBounds(600,280,100,40);
             jf3.add(jb8);
             
            jf3.getContentPane().setBackground(Color.CYAN);
            jf3.setSize(500,500);//window size
            jf3.setLayout(null);
            jf3.setVisible(true);   
            
            jb7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                               jf3.setVisible(false);
                               jf1.setVisible(true);
                }});
            
            jb5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    File input1 = new File("starbucks.txt");
                    File input2 = new File("bubbles.txt");

                    FileReader fr1=null;
                    FileReader fr2=null;

                    String searchword=jt1.getText();
                    String searchword2=jt1.getText();

                    String str1,str2;
                    try{
                          fr1=new FileReader(input1);
                          fr2=new FileReader(input2);

                          BufferedReader br1=new BufferedReader(fr1);
                          BufferedReader br2=new BufferedReader(fr2);
                          while((str1=br1.readLine())!= null){
                              if(str1.contains(searchword))
                                     //jl17=new JLabel("item in starbucks add:hanamkonda chowrasta");//label creation.
                                     jl17.setBounds(250,305,600,80);//
                                     jf3.add(jl17);
                                    
                             }
                             fr1.close();
                             while((str2=br2.readLine())!= null){
                                if(str2.contains(searchword2))
                                       //jl117=new JLabel("item in starbucks add:hanamkonda chowrasta");//label creation.
                                       jl117.setBounds(250,345,600,80);//
                                       jf3.add(jl117);
                                      
                               }
                               fr2.close();
                        }
                        catch(Exception ex){
                            System.out.print(ex.getMessage());
                        }
                       
                           
                    
                        
                    
                }});
               
                jb8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae){
                          
                          String msg1="";
                          jt1.setText("");
                          jl117.setText(msg1);
                          jl17.setText(msg1);

                    }});
                
         }
       });


     //---------------------visitor section ends-------------------

     //--------------------EXIT-----------------------------
     e.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            jf1.setVisible(false);
            jf2.setVisible(false);
            jf3.setVisible(false);
            jf4.setVisible(false);
            jf5.setVisible(false);
        }
       });
     //----------------EXIT------------------------------
    }

    public static void main(String args[]) throws IOException {
        new Project();
    }
}