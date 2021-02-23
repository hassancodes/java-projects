import java.util.Random;

public class ramanujansTaxiNum{
    public void taxiproblem() {
        int l = 0;
        
//      four numbers
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;
        Random random = new Random();

        while (l != 1) {

            for (int x = 0; x < 100; x++) {
                i = random.nextInt(42);
                j = random.nextInt(42);
                k = random.nextInt(42);
                m = random.nextInt(42);

                if ((Math.pow(i, 3) + Math.pow(j, 3) == 1729) && (Math.pow(k, 3) + Math.pow(m, 3) == 1729) && (i != m) && (i != k)) {

                    String b = "Number Found: " + i + " " + j + " The other two number are: " + k + " " + m;
                    System.out.println(b);

                    l += 1;
                    if (l == 1) {
                        break; 
                    }

                } else {}
            }
        }
    }
}
