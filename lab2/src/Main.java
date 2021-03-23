import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] symbols = in.nextLine().toCharArray();
        int length = in.nextLine().length();
        boolean result = false;
        int transition = 1;
        for (int i = 0; i < length; i++) {
            switch (transition) {
                case 1: {
                    switch (symbols[i]) {
                        case 'a': {
                            transition = 2;
                            break;
                        }
                        case 'b': {
                            transition = 3;
                            break;
                        }
                        case 'c': {
                            result = false;
                            i = length;
                            break;
                        }
                        case 'e': {
                            transition = 4;
                            if (i == length - 1) {
                                result = true;
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (symbols[i]) {
                        case 'b':
                        case 'c': {
                            transition = 4;
                            if (i == length - 1) {
                                result = true;
                            }
                            break;
                        }
                        case 'a': {
                            result = false;
                            i = length;
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (symbols[i]) {
                        case 'a':
                        case 'b': {
                            result = false;
                            i = length;
                            break;
                        }
                        case 'c': {
                            transition = 3;
                            if (i == length - 1) {
                                result = true;
                            }
                            break;
                        }
                    }
                    break;
                }

            }
        }
        System.out.println(result);
    }

}

