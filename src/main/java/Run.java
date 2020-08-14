public class Run {
    public static void main(String[] args) {
        //Lombok is working
        Worker worker = new Worker(1, "Vasya", 22);
        System.out.println(worker.toString());
    }
}
