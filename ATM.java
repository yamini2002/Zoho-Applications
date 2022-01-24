import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class Demo1{

    public static int amount[]={2000,500,200,100};
    public static int[] money ={0,0,0,0};
    public static int[] addamt = new int[4];
    public static String[] usr_name ={"yamini","sruthi"};
    public static String[] usr_pass ={"1234","4321"};
    public static String[][] usr_min = new String[usr_name.length][7];
    public static String[] use_id ={"A001","A002"};
    public static int[] usr_bal ={40000,7000};
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static Date date = new Date();
    public static Scanner sc=new Scanner(System.in);

    public static void depositmoney(){
        clearScreen();
        System.out.println("\tWelcome Admin...");
        System.out.println("2000 notes  :");
        addamt[0]=addamt[0]+sc.nextInt();
        System.out.println("500 notes   :");
        addamt[1]=addamt[1]+sc.nextInt();
        System.out.println("200 notes   :");
        addamt[2]=addamt[2]+sc.nextInt();
        System.out.println("100 notes   :");
        addamt[3]=addamt[3]+sc.nextInt();
        System.out.println("Amount deposited ...");
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){
        }

    }
    public static void pingeneration(int i){
       clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("Enter new Pin:");
        String newpin_code=sc.next();
        sc.nextLine();
        System.out.println("Confirm new Pin:");
        String repin_code=sc.next();
        sc.nextLine();
        if(newpin_code.equals(repin_code)){
            usr_pass[i]=newpin_code;
            System.out.println("Pin changed Succesfully...");
        }else{
            System.out.println("Pin mismatch...");
        }
    }
    public static void usrdepositmoney(int i){
        clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("2000 notes  :");
        int two=sc.nextInt();
        addamt[0]=addamt[0]+two;
        System.out.println("500 notes   :");
        int five=sc.nextInt();
        addamt[1]=addamt[1]+five;
        System.out.println("200 notes   :");
        int two1=sc.nextInt();
        addamt[2]=addamt[2]+two1;
        System.out.println("100 notes   :");
        int one1=sc.nextInt();
        addamt[3]=addamt[3]+one1;
        int amount=(two*2000)+(five*500)+(two1*200)+(one1*100);
        usr_bal[i]= usr_bal[i]+amount;
        System.out.println("Amount deposited ...");
        System.out.println("Press 1 to continue");
        usr_min[i][0]= usr_min[i][1];
        usr_min[i][1]= usr_min[i][2];
        usr_min[i][2]= usr_min[i][3];
        usr_min[i][3]= usr_min[i][4];
        usr_min[i][4]= usr_min[i][5];
        usr_min[i][5]=formatter.format(date) + " Rs: "+amount+" deposited ";
        int one=sc.nextInt();
        if(one==1){
        }
    }
    public static void transaction(int i){
        clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("Enter bank id to transfer :");
        String bank_id=sc.next();
        sc.nextLine();
        int trans=0;
        int flag=0;
        for(int t = 0; t< use_id.length; t++){
            if(bank_id.equals(use_id[t])){
                trans=t;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Enter Amount transfer to "+ usr_name[trans]);
            int amount=sc.nextInt();
            if(usr_bal[i]>=amount){
                usr_bal[i]-=amount;
                usr_bal[trans]+=amount;
                System.out.println("Amount transfered...");
                usr_min[i][0]= usr_min[i][1];
                usr_min[i][1]= usr_min[i][2];
                usr_min[i][2]= usr_min[i][3];
                usr_min[i][3]= usr_min[i][4];
                usr_min[i][4]= usr_min[i][5];
                usr_min[i][5]=formatter.format(date) + " Rs: "+amount+" transfered to "+bank_id+"";
            }else{
                System.out.println("Insufficient balance...");
            }}
        else{
            System.out.println("Invalid ID....");
        }
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){
        }
    }
    public static void minstatement(int i){
        clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("Mini Statement :");

        for(int j=0;j<7;j++){
            String Null= usr_min[i][6];

            if(usr_min[i][j].equals(Null)){
                System.out.println(usr_min[i][j]);}
        }
        System.out.println("Press 1 to continue...");
        int one=sc.nextInt();
        if(one==1){
        }
    }

    public static void balance(){
        clearScreen();
        System.out.println("\tWelcome Admin");
        int t2000=addamt[0];
        int t500=addamt[1];
        int t200=addamt[2];
        int t100=addamt[3];
        System.out.println("2000 notes  :"+t2000);
        System.out.println("500 notes   :"+t500);
        System.out.println("200 notes   :"+t200);
        System.out.println("100 notes   :"+t100);
        System.out.println("Amount displayed ...");
        System.out.println("Press 1 to continue...");
        int one=sc.nextInt();
        if(one==1){
        }
    }

    public static void usrbalance(int i){
        clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("Amount :"+ usr_bal[i]);
        System.out.println("Amount displayed ...");
        System.out.println("Press 1 to continue...");
        int one=sc.nextInt();
        if(one==1){
        }
    }

    public static void withdraw(int i){
        clearScreen();
        System.out.println("\tWelcome "+ usr_name[i]);
        System.out.println("Enter Amount :");
        int withdraw_amount =sc.nextInt();
        int withdraw_amount1 = withdraw_amount;
        int withdraw_amount2 = withdraw_amount;
        int countamt[]=new int [4];
        int countamt1[]=new int [4];
        int count3=0;
        for(int j=0;j<4;j++){
            countamt1[j]=addamt[j];
            count3+=addamt[j];
        }
        int amount=(addamt[0]*2000)+(addamt[1]*500)+(addamt[2]*200)+(addamt[3]*100);
        if(withdraw_amount %10==0 && withdraw_amount <=amount  ){
            v:while(withdraw_amount1 >0){
                if(count3!=0){

                    if(withdraw_amount1 >=2000 && countamt1[0]!=0){
                        countamt[0]++;
                        countamt1[0]--;
                        withdraw_amount1 = withdraw_amount1 -2000;
                    }else if(withdraw_amount1 >=500 && countamt1[1]!=0){
                        countamt[1]++;
                        countamt[1]--;
                        withdraw_amount1 = withdraw_amount1 -500;
                    }else if(withdraw_amount1 >=200 && countamt1[2]!=0){
                        countamt[2]++;
                        countamt1[2]--;
                        withdraw_amount1 = withdraw_amount1 -200;
                    }else if(withdraw_amount1 >=100 && countamt1[3]!=0){
                        countamt1[3]--;
                        countamt[3]++;
                        withdraw_amount1 = withdraw_amount1 -100;
                    }
                    count3--;
                }else{
                    break v;
                }
            }
        }

        int amount1=(countamt[0]*2000)+(countamt[1]*500)+(countamt[2]*200)+(countamt[3]*100);
        int count =0;
        int count1=0;
        int count2=0;
        for(int j=0;j<4;j++){
            count2+=countamt[j];
            if(countamt[j]!=0){
                count1++;
                if(countamt[j]<=addamt[j])
                    count+=1;
            }
        }

        int two_thousand=0,five_hundred=0,two_hundred=0,one_hundred=0;
        if(withdraw_amount <=amount && withdraw_amount <= usr_bal[i] && count==count1 ){
            if(withdraw_amount %10==0  ){
                while(withdraw_amount >0){
                    if(withdraw_amount >=2000 && countamt[0]!=0){
                        two_thousand++;
                        addamt[0]--;
                        countamt[0]--;
                        withdraw_amount = withdraw_amount -2000;
                    }else if(withdraw_amount >=500 && countamt[1]!=0){
                        five_hundred++;
                        addamt[1]--;
                        countamt[1]--;
                        withdraw_amount = withdraw_amount -500;
                    }else if(withdraw_amount >=200 && countamt[2]!=0){
                        two_hundred++;
                        addamt[2]--;
                        countamt[2]--;
                        withdraw_amount = withdraw_amount -200;
                    }else if(withdraw_amount >=100 && countamt[3]!=0){
                        one_hundred++;
                        addamt[3]--;
                        countamt[3]--;
                        withdraw_amount = withdraw_amount -100;
                    }
                }
                System.out.println("2000 notes :"+two_thousand);
                System.out.println("500 notes  :"+five_hundred);
                System.out.println("200 notes  :"+two_hundred);
                System.out.println("100 notes  :"+one_hundred);
                System.out.println("\tThanks for visiting");
                usr_bal[i]= usr_bal[i]- withdraw_amount2;


            }else{
                System.out.println("Enter amount only in hundreds");
            }}else{
            System.out.println("Insufficient money in atm visit near by atm ....");
        }
        System.out.println("Press 1 to continue...");
        int one=sc.nextInt();
        if(one==1){

        }
    }

    public static void delay(int delay){
        System.out.println("Press Enter to continue...");
        String one=sc.nextLine();
        if(one ==" "){
        }
    }
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){
        while(true){
            System.out.println("Welcome to ATM\nAdmin : 1\nUser  : 2\nExit  : 3");
            System.out.println("Enter the choice : ");
            int choice = sc.nextInt();
            if(choice==1){
                a:while(true){
                System.out.println("Welcome to ATM\nyou enter the number \n"+choice);
                System.out.println("Enter the admin username :");
                String adname=sc.next();
                sc.nextLine();
                System.out.println("Enter the admin password :");
                String adpass=sc.nextLine();
                if(adname.equals("admin") && adpass.equals("1234")){
                    while(true){
                        System.out.println("\tWelcome Admin\nDeposit money : 1\nBalance : 2\nHome  :3");
                        int admin =sc.nextInt();
                        if(admin==1){
                            depositmoney();
                        }else if(admin==2){
                            balance();
                        }else if(admin==3){
                            break a;
                        }else {
                            System.out.println("Invalid input");
                        }
                    }

                }else{
                    System.out.println("invalid user name password");
                }}

    }else if(choice==2) {
                System.out.println("Enter the  username :");
                String usr_name2 = sc.next();
                sc.nextLine();
                System.out.println("Enter the  password :");
                String usr_pass2 = sc.next();
                sc.nextLine();

                    for (int i = 0; i < usr_name.length; i++) {
                        if (usr_name2.equals(usr_name[i]) && usr_pass2.equals(usr_pass[i])){
                        while (true) {
                            clearScreen();
                            System.out.println("\tWelcome " + usr_name[i]);
                            System.out.println("Deposit money : 1\nWithdraw money:2\nBalance : 3\nMini Statement  :4\nPin Generation :5\nTransaction :6\nHome  :7");
                            int user = sc.nextInt();
                            if (user == 1) {
                                usrdepositmoney(i);
                            } else if (user == 2) {
                                withdraw(i);
                            } else if (user == 3) {
                                usrbalance(i);
                            } else if (user == 4) {
                                minstatement(i);
                            } else if (user == 5) {
                                pingeneration(i);
                            } else if (user == 6) {
                                transaction(i);
                            } else if (user == 7) {
                                break;
                            } else {
                                System.out.println("Invalid input");
                                delay(2000);
                            }
                        }
                    }}
                }
            else if(choice==3){
                System.out.println("Thanks for Coming....");
                break;
            }else{
                System.out.println("Invalid input");
                delay(2000);
            }
            clearScreen();
            }
        }
    }


