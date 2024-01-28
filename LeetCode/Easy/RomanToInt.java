package Easy;

public class RomanToInt {
    public static int romanToInt(String s) {

        int number = 0;
        int i = s.length();
        String convertPair = s.substring(i - 2, i);
        while (i > 0) {

            if (i == 1)
                convertPair = s.substring(0, 1);
            else
                convertPair = s.substring(i - 2, i);

            //if (convertPair.matches("DL") || convertPair.matches("MI") || convertPair.matches("MX") || convertPair.matches("MC") || convertPair.matches("MD") || convertPair.matches("ML") || convertPair.matches("DI") || convertPair.matches("DV") || convertPair.matches("DX") || convertPair.matches("DL") || convertPair.matches("DC") || convertPair.matches("CI") || convertPair.matches("CX") || convertPair.matches("CV") || convertPair.matches("CL") || convertPair.matches("LI") || convertPair.matches("LX") || convertPair.matches(""))
              //  convertPair = s.substring(i - 1, i);

            if (convertPair.matches("II"))
                number = (number + 2);
            if (convertPair.matches("IV"))
                number = (number + 4);
            if (convertPair.matches("VI"))
                number = (number + 6);
            if (convertPair.matches("IX"))
                number = (number + 9);
            if (convertPair.matches("XI"))
                number = (number + 11);
            if (convertPair.matches("IL"))
                number = (number + 49);
            if (convertPair.matches("LI"))
                number = (number + 51);
            if (convertPair.matches("IC"))
                number = (number + 99);
            if (convertPair.matches("CI"))
                number = (number + 101);
            if (convertPair.matches("ID"))
                number = (number + 499);
            if (convertPair.matches("DI"))
                number = (number + 501);
            if (convertPair.matches("IM"))
                number = (number + 999);
            if (convertPair.matches("MI"))


            if (convertPair.matches("VX"))
                number = (number + 5);
            if (convertPair.matches("XV"))
                number = (number + 15);
            if (convertPair.matches("VL"))
                number = (number + 45);
            if (convertPair.matches("LV"))
                number = (number + 55);
            if (convertPair.matches("VC"))
                number = (number + 95);
            if (convertPair.matches("CV"))
                number = (number + 105);
            if (convertPair.matches("VD"))
                number = (number + 495);
            if (convertPair.matches("DV"))
                number = (number + 505);
            if (convertPair.matches("VM"))
                number = (number + 995);
            if (convertPair.matches("MV"))
                number = (number + 1005);

            if (convertPair.matches("XX"))
                number = (number + 20);
            if (convertPair.matches("XL"))
                number = (number + 40);
            if (convertPair.matches("LX"))
                number = (number + 60);
            if (convertPair.matches("XC"))
                number = (number + 90);
            if (convertPair.matches("CX"))
                number = (number + 110);
            if (convertPair.matches("XD"))
                number = (number + 490);
            if (convertPair.matches("DX"))
                number = (number + 510);
            if (convertPair.matches("XM"))
                number = (number + 990);
            if (convertPair.matches("MX"))
                number = (number + 1010);


            if (convertPair.matches("LC"))
                number = (number + 50);
            if (convertPair.matches("CL"))
                number = (number + 150);
            if (convertPair.matches("LD"))
                number = (number + 450);
            if (convertPair.matches("DL"))
                number = (number + 550);
            if (convertPair.matches("LM"))
                number = (number + 950);
            if (convertPair.matches("ML"))
                number = (number + 1050);

            if (convertPair.matches("CC"))
                number = (number + 200);
            if (convertPair.matches("CD"))
                number = (number + 400);
            if (convertPair.matches("DC"))
                number = (number + 600);
            if (convertPair.matches("CM"))
                number = (number + 900);
            if (convertPair.matches("MC"))
                number = (number + 1100);
            

            if (convertPair.matches("DM"))
                number = (number + 500);
            if (convertPair.matches("MD"))
                number = (number + 1500);

            if (convertPair.matches("MM"))
                number = (number + 2000);

            if (convertPair.matches("I"))
                number = (number + 1);
            if (convertPair.matches("V"))
                number = (number + 5);
            if (convertPair.matches("X"))
                number = (number + 10);
            if (convertPair.matches("L"))
                number = (number + 50);
            if (convertPair.matches("C"))
                number = (number + 100);
            if (convertPair.matches("D"))
                number = (number + 500);
            if (convertPair.matches("M"))
                number = (number + 1000);

            i--;
            i--;
        }

        return number;
    }
}
