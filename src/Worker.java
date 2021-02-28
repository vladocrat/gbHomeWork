public class Worker {
    private String name;
    private String role;
    private String email;
    private String phone;
    private float wage;
    private int age;

    Worker(String name, String role, String email, String phone, float wage, int age) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public static void getWorkerInfo(Worker worker) {
            System.out.println("name: " + worker.name);
            System.out.println("role: " + worker.role);
            System.out.println("email: " + worker.email);
            System.out.println("phone: " + worker.phone);
            System.out.println("wage: " + worker.wage);
            System.out.println("age: " + worker.age);
    }


    public static void main(String[] args) {
        Worker worker = new Worker("Vlad", "carpenter", "hehe@gmail.com", "123", 12.3f, 20);
        Worker worker1 = new Worker("Vitaliy", "web designer", "dontcontact@mail.ru", "89103502232", 12.5f,45);
        Worker worker2 = new Worker("Vasily", "software engineer", "something@gmail.com", "1234554321", 23.1f, 40);
        Worker worker3 = new Worker("Nikolay", "fisher", "doesntexist@gmial.com", "5464367372", 0.2f, 18);
        Worker worker4 = new Worker("Dimon", "forester", "notneeded@gmail.com", "123456789", 15f, 41);


        Worker[] workers = new Worker[5];
        workers[0] = worker;
        workers[1] = worker1;
        workers[2] = worker2;
        workers[3] = worker3;
        workers[4] = worker4;

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                getWorkerInfo(workers[i]);
                System.out.println();
            }
        }
    }
}
