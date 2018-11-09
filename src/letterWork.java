import java.util.*;

public class letterWork{
    /*
       Enter anything u want (except special characters)
       If memory or time limit exceeds, retry!
    */
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        System.out.print("The pattern for \""+s.toUpperCase()+"\" will be :\n\n\n");
        for(int pat=0;pat<s.length();pat++){
            switch(s.charAt(pat)){
                case ' ':
                    System.out.println("\n\n\n\n\n\n\n");
                    break;
                case 'a':case 'A':
                    int d=17,a=d/2,b=a,c=a,e=d;
                    d=(b==4&&c==12)?d-10:d-2;
                    for(int i=1;i<=e-2;i++){
                        for(int j=1;j<=d;j++){
                            if(b==4&&c==12&&j>=4&&j<=12||(j==b||j==c))
                                System.out.print("A");
                            else
                                System.out.print(" ");
                        }b--;c++;
                        System.out.println();
                    }
                    break;
                case 'b':case 'B':
                    int c1=8;
                    for(int i=1;i<=c1-2;i++){
                        for(int j=1;j<=c1-1;j++)
                            if(i==1) System.out.print("B");
                        for(int j=0;j<1;j++){
                            if(i==2||i==5) System.out.print("B      B");
                            if(i==3||i==4) System.out.print("B       B");
                        }
                        for(int j=1;j<=c1-1;j++){
                            if(i==6) System.out.print("B");
                        }
                        System.out.println();
                    }for(int i=1;i<=c1-3;i++){
                        for(int j=1;j<=c1-1;j++){
                            if(i==5) System.out.print("B");
                        }
                        for(int j=0;j<1;j++){
                            if(i==1||i==4) System.out.print("B      B");
                            if(i==2||i==3) System.out.print("B       B");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'c':case 'C':
                    int aa=9;
                    for(int i=1;i<=aa;i++){
                        for(int j=1;j<=aa;j++){
                            if((i==1||i==aa)&&j>2) System.out.print("C");
                            else if((i==1&&j==1)||(i==aa&&j==1)) System.out.print(" ");
                        }
                        System.out.println("C");
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'd':case 'D':
                    int e1=9;
                    for(int i=1;i<=e1;i++){
                        for(int j=0;j<1;j++){
                            if(i==1||i==9) System.out.print("DDDDDD");
                            else if(i==2||i==8) System.out.print("D     D");
                            else if(i==3||i==7) System.out.print("D      D");
                            else if(i>3&&i<7) System.out.print("D       D");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'e':case 'E':
                    int a1=8;
                    for(int i=1;i<=a1-3;i++){
                        for(int j=1;j<=a1-1;j++){
                            if(i==1)
                                System.out.print("E");
                        }for(int j=1;j<=a1-3;j++){
                            if(i==5)
                                System.out.print("E");
                        }
                        System.out.println("E");
                    }for(int i=1;i<=a1-4;i++){
                        for(int j=1;j<=a1-1;j++){
                            if(i==4)
                                System.out.print("E");
                        }
                        System.out.println("E");
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'f':case 'F':
                    int a2=10;
                    for(int i=1;i<=a2;i++){
                        for(int j=1;j<=a2-1;j++){
                            if(i==1)
                                System.out.print("F");
                        }for(int j=1;j<=a2-3;j++){
                            if(i==5)
                                System.out.print("F");
                        }
                        System.out.println("F");
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'g':case 'G':
                    int h1=8;
                    for(int i=1;i<=h1;i++){
                        for(int j=1;j<=h1;j++){
                            if((i==1&&j>1)||(i==h1&&j>1)) System.out.print("G");
                            else if(i==5&&j>7) System.out.print("G    GGGG");
                            else if((i==6||i==7||i==8)&&j>7) System.out.print("G        ");
                            else if(((i==1||i==h1)&&j==1)||((i==1||i==h1)&&j==h1)) System.out.print(" ");
                        }
                        System.out.println("G");
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'h':case 'H':
                    int h2=10;
                    for(int i=1;i<=h2;i++){
                        if(i==5){
                            for(int j=1;j<=h2;j++)
                                System.out.print("H");
                        }else{System.out.print("H        H");}
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'I':case 'i':
                    int i1=11;
                    for(int i=1;i<=i1-2;i++){
                        if(i==1||i==i1-2){
                            for(int j=1;j<=i1;j++) System.out.print("I");
                        }else{
                            for(int j=1;j<=i1;j++){
                                if(j==i1/2)
                                    System.out.print("     I");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'j':case 'J':
                    int j1=10;
                    for(int i=1;i<=j1;i++){
                        for(int j=1;j<=j1+1;j++){
                            if(i==1) System.out.print("J");
                        }for(int j=0;j<1;j++){
                            if(i>=2&&i<=8) System.out.print("     J");
                        }for(int j=0;j<1;j++){
                            if(i==9) System.out.print("J    J");
                            if(i==10) System.out.print(" J J");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'k':case 'K':
                    int hk=1,hk1=7;
                    for(int i=1;i<=5;i++){
                        for(int j=8;j>=1;j--){
                            if(j==8||j==hk) System.out.print("K");
                            else System.out.print(" ");
                        }hk++;
                        System.out.println();
                    }
                    for(int i=1;i<=6;i++){
                        for(int j=8;j>=1;j--){
                            if(j==8||j==hk1) System.out.print("K");
                            else System.out.print(" ");
                        }hk1--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'l':case 'L':
                    for(int i=1;i<=10;i++){
                        for(int j=1;j<10;j++){
                            if(i==10) System.out.print("L");
                        }
                        System.out.println("L");
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'm':case 'M':
                    int on=2,of=10;
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=11;j++){
                            if((j==1||j==11)||(j==on||j==of)&&(on<=6&&of>=6)) System.out.print("M");
                            else System.out.print(" ");
                        }
                        on++;of--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'n':case 'N':
                    int on1=2;
                    for(int i=1;i<=8;i++){
                        for(int j=1;j<=9;j++){
                            if((j==1||j==9)||(j==on1)) System.out.print("N");
                            else System.out.print(" ");
                        }
                        on1++;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'o':case 'O':case '0':
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=10;j++){
                            if((i>=2&&i<=8)&&(j>=2&&j<=9)||(i==1||i==9)&&(j==1||j==10)) System.out.print(" ");
                            else System.out.print("O");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'p':case 'P':
                    for(int i=1;i<=9;i++){
                        if(i==1||i==5){
                            for(int j=1;j<=8;j++){
                                if(j!=8) System.out.print("P");
                                else System.out.print(" ");
                            }
                        }else if(i>=2&&i<=4){
                            for(int j=1;j<=8;j++){
                                if(j==1||j==8) System.out.print("P");
                                else System.out.print(" ");
                            }
                        }else System.out.print("P");
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'q':case 'Q':
                    int jm=1;
                    for(int i=1;i<=11;i++){
                        for(int j=1;j<=11;j++){
                            if((i==1||i==8)&&(j>=2&&j<=8)||(i>=6&&(j==jm))||((i>=2&&i<=7)&&(j==1||j==9))) System.out.print("Q");
                            else System.out.print(" ");
                        }
                        jm++;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'r':case 'R':
                    int jh=-2;
                    for(int i=1;i<=10;i++){
                        for(int j=1;j<=8;j++){
                            if(((i==1||i==5)&&j!=8)||(i>=2&&i<=4&&(j==1||j==8))||(i>=6&&(j==1||j==jh))) System.out.print("R");
                            else System.out.print(" ");
                        }
                        jh++;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 's':case 'S':
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=10;j++){
                            if((i==1&&j!=1)||(i==5&&(j>=2&&j<=9))||(i==9&&j!=10)||((i>=2&&i<=4&&j==1)||(i>=6&&i<=8&&j==10))) System.out.print("S");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 't':case 'T':
                    for(int i=1;i<=8;i++){
                        for(int j=1;j<=11;j++){
                            if(i==1||(j==6)) System.out.print("T");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'U':case 'u':
                    for(int i=1;i<=11;i++){
                        for(int j=1;j<=11;j++){
                            if(((j==1||j==11)&&i<=7)||(i==8&&(j==2||j==10))||((i==9)&&j>=4&&j<=8)) System.out.print("U");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'v':case 'V':
                    int ml=1,mk=16;
                    for(int i=1;i<=8;i++){
                        for(int j=1;j<=16;j++){
                            if(j==ml||j==mk) System.out.print("V");
                            else System.out.print(" ");
                        }
                        ml++;mk--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'w':case 'W':
                    int q1=2,q2=8,q3=7,q4=14;
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=15;j++){
                            if((i<=5&&(j==1||j==15))||(i>5&&(j==q1||j==q2||j==q3||j==q4))) System.out.print("W");
                            else System.out.print(" ");
                        }
                        if(i>5){
                            if(q1<=5) q1++;
                            if(q2<=11) q2++;
                            if(q3>=6) q3--;
                            if(q4>=12) q4--;
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'x':case 'X':
                    int hj=1,j1h=11;
                    for(int i=1;i<=11;i++){
                        for(int j=1;j<=11;j++){
                            if(j==hj||j==j1h) System.out.print("X");
                            else System.out.print(" ");
                        }
                        hj++;j1h--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'y':case 'Y':
                    int gh1=1,gh2=11;
                    for(int i=1;i<=11;i++){
                        for(int j=1;j<=11;j++){
                            if(j==gh1||j==gh2) System.out.print("Y");
                            else System.out.print(" ");
                        }
                        if(gh1<=5) gh1++;
                        if(gh2>=7) gh2--;
                        else gh2=6;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case 'z':case 'Z':
                    int lg=8;
                    for(int i=1;i<=8;i++){
                        for(int j=1;j<=8;j++){
                            if((i==1||i==8)||((i>1&&i<8)&&(j==lg))) System.out.print("Z");
                            else System.out.print(" ");
                        }
                        lg--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '1':
                    for(int i=1;i<=7;i++){
                        for(int j=1;j<=9;j++){
                            if((i==2&&j==3)||(i==3&&j==1)||(j==5||i==7)) System.out.print("1");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '2':
                    int jmk=7;
                    for(int i=1;i<=7;i++){
                        for(int j=1;j<=8;j++){
                            if((i==1&&j>=2&&j<=7)||((i>=2&&i<=3)&&j==1)||((i>=2&&i<=6)&&j==jmk)||((i==7)&&j>=2)) System.out.print("2");
                            else System.out.print(" ");
                        }
                        if(i>=2&&i<=6) jmk--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '3':
                    for(int i=1;i<=7;i++){
                        for(int j=1;j<=8;j++){
                            if(((i==1||i==4||i==7)&&j>=2)||(j==8)) System.out.print("3");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '4':
                    int yu=6;
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=9;j++){
                            if(((j==yu||j==6)&&i<=6&&i>=2)||(i==6)||(j==6)) System.out.print("4");
                            else System.out.print(" ");
                        }
                        if(yu>=2&&i<=5) yu--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '5':
                    for(int i=1;i<=8;i++){
                        for(int j=1;j<=9;j++){
                            if((i==1&&j!=1)||(i==4||i==8&&(j>=2&&j<=8))||((i>=2&&i<=3)&&j==1)||((i>=5&&i<=6)&&j==9)||(i==7&&(j==1||j==9))) System.out.print("5");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '6':
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=9;j++){
                            if((i==1||i==5||i==9)||(j==1)||(i>=5&&i<=9&&j==9)) System.out.print("6");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '7':
                    int jkl=9;
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=9;j++){
                            if(i==1||(j==jkl)) System.out.print("7");
                            else System.out.print(" ");
                        }
                        jkl--;
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '8':
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=9;j++){
                            if((i==1||i==5||i==9)||(j==1||j==9)) System.out.print("8");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                case '9':
                    for(int i=1;i<=9;i++){
                        for(int j=1;j<=9;j++){
                            if((i==1||i==4||i==9)||(j==9||(j==1&&(i>=1&&i<=4)))) System.out.print("9");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n\n\n");
                    break;
                default:
                    System.out.print("");
            }
        }
    }
}