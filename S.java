class S
{
    public static void main(String[] args)
    {
        String input = "Hello, World!$%";
        int specialCharCount = 0;

        System.out.println("Special characters:");
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch))
            {
                System.out.println(ch);
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
    }
}