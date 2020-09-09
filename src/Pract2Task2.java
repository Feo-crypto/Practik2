public class Pract2Task2 {

    public static class Doog{
        private String Name, breed;
        private boolean good;
        private int age;

        Doog(){}

        Doog(String Name,String breed,boolean good,int age){
            toHumanAge(age);
            this.Name=Name;
            this.breed=breed;
            this.good=good;
            this.good=true;//:D

        }
        private void toHumanAge(int age){
           this.age=7*age;
        }

        public void setName(String Name){
            this.Name=Name;
        }

        public void setAge(int age) {
            toHumanAge(age);
        }
        public void setBreed(String breed){
            this.breed=breed;
        }

        public void setGood(boolean good) {
            this.good = good;
        }

        public int getAge() {
            return age;
        }

        public String getBreed() {
            return breed;
        }

        public String getName() {
            return Name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "Name='" + Name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", good=" + good +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[]args){
        Doog[] DogArr=new Doog[4];

        DogArr[0]=new Doog("Korone","HoloGamer",true,100 );
        DogArr[1]=new Doog("Angus","Airedale Terrier",true,3);
        DogArr[2]=new Doog(	"Chester","Staffordshire Terrier",true,2);
        DogArr[3]=new Doog("Cherubim","Eldritch Abominations",false,1000);

        for (int i=0;i<4;i++){
            System.out.println(DogArr[i].toString());
        }
    }

}
