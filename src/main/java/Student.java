import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student{
        private String name ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
        public String toString() {
            return "StudentData{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student that = (Student) o;
            return age == that.age && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public  static  void main(String[] args){
        List<Student> studentData = Arrays.asList(
            new Student("Pratheeksh",23),
                new Student("Amar",24),
                new Student("Shreesha",22),
                new Student("Shodhan",25)
        );

      List<Student> students =  studentData.stream().sorted(Comparator.comparing(student-> student.age))
                .collect(Collectors.toList());
                System.out.println(students);


    }

}
