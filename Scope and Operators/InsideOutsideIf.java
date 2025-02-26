class InsideOutsideIf{
    public static void main(String[] args) {
        int outside=10;
        if(outside>5){
            int inside=2;
            System.out.println("Inside If Statement");
            System.out.println("Inside: "+inside);
            System.out.println("Outside: "+outside);
        }
        System.out.println("Outside If Statement");
            System.out.println("Inside: "+inside);
            System.out.println("Outside: "+outside);
    }
}