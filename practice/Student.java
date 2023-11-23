package basics.practice;

public class Student {
	public static void main(String[] args) {
        int num;
        String name;
        int marks;
        public class Demo{
            public static void main(String[]args){
                student s1 = new student();
                s1.roll no = 1;
                s1.name = "Roopa";
                s1.marks = 80;
                
                student s2 = new student();
                s2.roll no = 2;
                s2.name = "keerthi";
                s2.marks = 87;
                
                student s3 = new student();
                s3.roll no = 3;
                s3.name = "sweety";
                s3.marks = 84;
                
                student students[] = new student[];
                students[0] = s1;
                students[1] = s2;
                students[2] = s3;
        
        for(int i=0;i<students.length();i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }
                
                
                
            }
        }
        
        
    }
}

}
