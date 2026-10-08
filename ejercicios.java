class EjerciciosLogicos {

    public static void main(String[] args) {
        System.out.println("Ejercicios logicos - Resultados:");

        // 1. 5 > 3 && 10 < 20
        boolean ex1 = (5 > 3) && (10 < 20);
        System.out.println("1: " + ex1);

        // 2. 7 == "7" || 4 <= 2. 
        boolean ex2 = false || (4 <= 2);
        System.out.println("2: " + ex2);

        // 3. !(8 == 6)
        boolean ex3 = !(8 == 6);
        System.out.println("3: " + ex3);

        // 4. (8 == 8) || (9 >= 9)
        boolean ex4 = (8 == 8) || (9 >= 9);
        System.out.println("4: " + ex4);

        // 5. (3 < 2) && (2 > 1)
        boolean ex5 = (3 < 2) && (2 > 1);
        System.out.println("5: " + ex5);

        // 6. 
        boolean ex6 = "JS".equals("js") || "Node".equals("Node");
        System.out.println("6: " + ex6);

        // 7. (10 % 2 == 0) && (15 % 2 == 1)
        boolean ex7 = (10 % 2 == 0) && (15 % 2 == 1);
        System.out.println("7: " + ex7);

        // 8. !(true && false)
        boolean ex8 = !(true && false);
        System.out.println("8: " + ex8);

        // 9. ("5" == 5) && ("5" == 5)
        boolean ex9 = false && false;
        System.out.println("9: " + ex9);

        // 10. (2 * 2 == 4) || (3 + 2 == 10)
        boolean ex10 = (2 * 2 == 4) || (3 + 2 == 10);
        System.out.println("10: " + ex10);

        // 11. ("hola".length == 4) && ("adios".length > 3)
        boolean ex11 = ("hola".length() == 4) && ("adios".length() > 3);
        System.out.println("11: " + ex11);

        // 12. false || (true && true)
        boolean ex12 = false || (true && true);
        System.out.println("12: " + ex12); 

        // 13. !(false) && (2 ** 3 == 8).
        boolean ex13 = !false && (2 * 2 * 2 == 8);
        System.out.println("13: " + ex13);

        // 14. (100 / 10 == 10) || (50 / 5 == 20)
        boolean ex14 = (100 / 10 == 10) || (50 / 5 == 20);
        System.out.println("14: " + ex14);

        // 15. ("A" < "B") && ("a" > "Z"). 
        boolean ex15 = ("A".compareTo("B") < 0) && ("a".compareTo("Z") > 0);
        System.out.println("15: " + ex15);

        // 16. (5 >= 5) && (10 < 5)
        boolean ex16 = (5 >= 5) && (10 < 5);
        System.out.println("16: " + ex16);

        // 17. (3 != 2) || (3 == 3)
        boolean ex17 = (3 != 2) || (3 == 3);
        System.out.println("17: " + ex17);

        // 18. !(7 > 3 && 2 < 5)
        boolean ex18 = !(7 > 3 && 2 < 5);
        System.out.println("18: " + ex18);

        // 20. (1 + 2 * 3 == 7) && (4 * 2 == 8)
        boolean ex20 = (1 + 2 * 3 == 7) && (4 * 2 == 8);
        System.out.println("20: " + ex20);
    }
}
