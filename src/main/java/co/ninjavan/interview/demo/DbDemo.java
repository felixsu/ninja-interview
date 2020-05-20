package co.ninjavan.interview.demo;

/**
 * Objective:
 * check on resources/db/task1.sql
 * there are score, student presence, and students table
 *
 * use Plain JDBC api to print the data, you don't need to run it using real database.
 */
public class DbDemo {

    public static void main(String[] args) {
        System.out.println("Run DB Demo");
    }

    /**
     * given a student id, print the name and all his score
     * e.g given student card id = abcd123
     *
     * | student name | course   | score  |
     * |    Rheza     |  Math    | 100    |
     * |    Rheza     |  Biology |  78    |
     */
    private static void task1() {
        System.out.println("task 1");

        String sql;

        sql = "SELECT students.name, score.score FROM students,score \n" +
                "WHERE students.id = score.student_id AND students.student_id_card = 'abcd123';";
        /*
        or
         */

        sql = "SELECT st.name, sc.score FROM students st INNER JOIN score sc ON st.id=sc.student_id \n" +
                "WHERE st.student_id_card = 'abcd123';";
    }

    /**
     * given a student id, print the name and all his score
     * e.g given a date = 2019-05-01
     *
     * | student name | date         | class   | coming   |
     * |    Rheza     |  2019-05-01  |  X      |  true    |
     * |    John      |  2019-05-01  |  Y      |  true    |
     * |    Lan       |  2019-05-01  |  XY     |  true    |
     * |    Snow      |  2019-05-01  |  XX     |  false   |
     * |    Dan       |  2019-05-01  |  MM     |  false   |
     *
     */
    private static void task2() {
        System.out.println("task 2");

        String sql = "SELECT st.name, sc.score FROM students st \n" +
                "INNER JOIN score sc ON st.id=sc.student_id INNER JOIN student_presence sp ON st.id=sp.id \n" +
                "WHERE sp.date = '2019-05-01';";
    }

}
