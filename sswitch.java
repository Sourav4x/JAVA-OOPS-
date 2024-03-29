class sswitch{
    public static void main(String[] args)
    {
        String day;
        day="sunday";
        String result="";
        switch(day)
        {
        case "monday","tuesday" -> result="4";
        case "sunday" -> result="6am";
        default -> result="10am";
        }
        System.out.println(result);
}
}