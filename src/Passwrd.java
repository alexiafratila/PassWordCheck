public class Passwrd {
        public static int checkPassword (String s) {
            int n =s.length();
            boolean checkLowercase = false;
            boolean checkUppercase = false;
            boolean checkDigit = false;
            boolean checkRepeatLetter = false;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c))
                    checkLowercase = true;
                if (Character.isUpperCase(c))
                    checkUppercase = true;
                if (Character.isDigit(c))
                    checkDigit = true;
                if (i >= 2 && s.charAt(i-2) == s.charAt(i-1) && s.charAt(i-1) == c)
                    checkRepeatLetter = true;
            }

            int missingCondition = 0;
            if (!checkLowercase)
                missingCondition++;
            if (!checkUppercase)
                missingCondition++;
            if (!checkDigit)
                missingCondition++;
            if (checkRepeatLetter)
                missingCondition++;


            if (n >= 6 && n <= 20 && missingCondition == 0)
                return 0;
            if (n >= 6 && n <= 20 && missingCondition != 0)
                return missingCondition;
            if (n < 6 && missingCondition == 0)
                return 6-n;
            if (n > 20 && missingCondition == 0)
                return n-20;
            if (n < 6 && missingCondition != 0)
                return 6 - n + missingCondition;
            if (n > 20 && missingCondition != 0)
                return n - 20 + missingCondition;
            return n;
        }
}
