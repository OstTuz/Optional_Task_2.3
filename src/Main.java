public class Main {

    public static void main(String[] args)
    {
        double averageLength;

        int sum = 0;
        for (int i = 0; i < args.length; i++)
        {
            sum += args[i].length();
        }

        averageLength = sum/args.length;
        System.out.println("Average length is "+ averageLength);
        System.out.println("Elements that has less length than average length:");
        for (int i = 0; i < args.length; i++)
        {
            if (args[i].length() < averageLength)
            {
                System.out.println(args[i]);
            }
        }
    }
}
