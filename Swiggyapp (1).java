import java.util.Scanner;
class Swiggyapp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long Registered_phno = 8015996231L;
        System.out.println("\t\t\t Enter your phone number");
        long User_reg_phno = sc.nextLong();
        System.out.println("Processing---------");
        Thread.sleep(1000);
        if (Registered_phno == User_reg_phno) {
            System.out.println("\t\t\tEnter the OTP:");
            int System_Otp=(int)(Math.random()*9999+9999); 
            Thread.sleep(2000);
            System.out.println(System_Otp);
            int User_Otp = sc.nextInt();
            if (System_Otp == User_Otp) {
                System.out.println("\t\t\tLOGIN SUCCESSFUL!");
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("\t\t\tSelect Hotel");
                System.out.println("1. BHUARI");
                System.out.println("2. A2B");
                System.out.println("3. SS HYDERABAD");
                int Hotel = sc.nextInt();
                switch (Hotel) {
                    case 1: {
                        System.out.println("\t\t\t Welcome to BHUARI");
                        System.out.println("\t\t\tSelect your Food");
                        Thread.sleep(1000);
                        System.out.println("1. Chicken Biryani");
                        System.out.println("2. Mutton Biryani");
                        System.out.println("3. Prawn Biryani");
                        int FoodChoosen = sc.nextInt();
                        Thread.sleep(3000);
                        if (FoodChoosen == 1 || FoodChoosen == 2 || FoodChoosen == 3) {
                            int Chicken_Biryani_price = 200;
                            int Mutton_Biryani_price = 400;
                            int Prawn_Biryani_price = 190;
                            System.out.println("\t\t\t Enter the Quantity ");
                            int Quantity = sc.nextInt();
                            double Bill_amount = 0;
                            if (FoodChoosen == 1) {
                                Bill_amount = Chicken_Biryani_price * Quantity;
                            } else if (FoodChoosen == 2) {
                                Bill_amount = Mutton_Biryani_price * Quantity;
                            } else if (FoodChoosen == 3) {
                                Bill_amount = Prawn_Biryani_price * Quantity;
                            }
                            double Total_amount = Bill_amount;
                            System.out.println("Total Amount:  " + Total_amount);
                            System.out.println("\t\t\tCan I confirm your order? (1 for Yes, 0 for No)");
                            int Confirm = sc.nextInt();
                            if (Confirm == 1) {
                                System.out.println("\t\t\tRedirecting to payment:");
                                System.out.println("Select your payment method");
                                Thread.sleep(1000);
                                System.out.println("\t\t\t1. Google Pay");
                                System.out.println("\t\t\t2. Phone Pay");
                                Thread.sleep(1000);
                                int Payment_mode = sc.nextInt();
                                if (Payment_mode == 1 || Payment_mode == 2) {
                                    long mpin = 801599L;
                                    System.out.println("\t\t\tEnter the user MPIN:");
                                    long User_Mpin = sc.nextLong();
                                    if (User_Mpin == mpin) {
                                        System.out.println("\t\t\tEnter the Bill Amount " + Total_amount);
                                        double Amount = sc.nextDouble();
                                        if (Total_amount == Amount) {
                                            System.out.println("\t\t\tYour order has been placed --------------------- Thank you!");
                                        } else {
                                            System.out.println("\t\t\tIncorrect amount entered. Order canceled.");
                                        }
                                    } else {
                                        System.out.println("\t\t\tIncorrect MPIN. Order canceled.");
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("\t\t\tWelcome to A2B");
                        System.out.println("\t\t\t Select your food");
                        Thread.sleep(1000);
                        System.out.println("\t\t\t1. DOSA");
                        System.out.println("\t\t\t2. Sambar Idly");
                        System.out.println("\t\t\t3. Pongal");
                        int FoodChoosen = sc.nextInt();
                        if (FoodChoosen == 1 || FoodChoosen == 2 || FoodChoosen == 3) {
                            int Dosa_price = 100;
                            int Sambar_idly_price = 120;
                            int Pongal_price = 80;
                            System.out.println("\t\t\t Enter the Quantity ");
                            int Quantity = sc.nextInt();
                            int Bill_amount = 0;

                            if (FoodChoosen == 1) {
                                Bill_amount = Dosa_price * Quantity;
                            } else if (FoodChoosen == 2) {
                                Bill_amount = Sambar_idly_price * Quantity;
                            } else if (FoodChoosen == 3) {
                                Bill_amount = Pongal_price * Quantity;
                            }
                            int Total_amount = Bill_amount;
                            System.out.println("Total_amount: " + Total_amount);
                            System.out.println("Can I confirm your order? (1 for Yes, 0 for No)");
                            int confirm = sc.nextInt();
                            if (confirm == 1) {
                                System.out.println("\t\t\tRedirecting to payment:");
                                System.out.println("Select your payment method");
                                Thread.sleep(1000);
                                System.out.println("\t\t\t1. Google Pay");
                                System.out.println("\t\t\t2. Phone Pay");
                                Thread.sleep(1000);
                                int Payment_mode = sc.nextInt();
                                if (Payment_mode == 1 || Payment_mode == 2) {
                                    long mpin = 801599L;
                                    System.out.println("\t\t\tEnter the user MPIN:");
                                    long User_Mpin = sc.nextLong();
                                    if (User_Mpin == mpin) {
                                        System.out.println("\t\t\tEnter the Bill Amount " + Total_amount);
                                        double Amount = sc.nextDouble();
                                        if (Total_amount == Amount) {
                                            System.out.println("\t\t\tYour order has been placed --------------------- Thank you!");
                                        } else {
                                            System.out.println("\t\t\tIncorrect amount entered. Order canceled.");
                                        }
                                    } else {
                                        System.out.println("\t\t\tIncorrect MPIN. Order canceled.");
                                    }
                                }
                            }
                        }
                    }
                    break;
                    default: {
                        System.out.println("YOU CHOOSEN WRONG HOTEL! OOPS");
                    }
                }
            }
        }
    }
}
