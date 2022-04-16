package tutorial5.task3;

public class TrainingCourseTest {
    
    public static void main(String[] args) {
        Course[] courses = new Course[16];
        courses[0] = new OneDayCourse(6,true, true);
        courses[1] = new OneDayCourse(5,false, true);
        courses[2] = new OneDayCourse(4,true, false);
        courses[3] = new OneDayCourse(3,false, false);
        courses[4] = new OneDayCourse(10,true, true);
        courses[5] = new OneDayCourse(12,false, true);
        courses[6] = new OneDayCourse(16,true, false);
        courses[7] = new OneDayCourse(18,false, false);

        courses[8] = new ThreeDayCourse(6,true, true);
        courses[9] = new ThreeDayCourse(5,false, true);
        courses[10] = new ThreeDayCourse(4,true, false);
        courses[11] = new ThreeDayCourse(3,false, false);
        courses[12] = new ThreeDayCourse(10,true, true);
        courses[13] = new ThreeDayCourse(12,false, true);
        courses[14] = new ThreeDayCourse(16,true, false);
        courses[15] = new ThreeDayCourse(18,false, false);

        int courseCount = 0;
        for (Course c : courses) {
            System.out.println("The cost for course number " + Integer.toString(courseCount+1) + " is:   $" + c.calculateTotalCost());
            ++courseCount;
        }
    }

}
