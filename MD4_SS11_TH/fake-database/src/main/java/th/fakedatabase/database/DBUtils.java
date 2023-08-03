package th.fakedatabase.database;

import th.fakedatabase.model.Dept;
import th.fakedatabase.model.Emp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DBUtils {
    private static final List<Dept> DEPARTMENTS = new ArrayList<>();
    static {
        initData();
    }
    // Mô phỏng dữ liệu trong Database.
    private static void initData() {
        Dept PhongBan1 = new Dept(10, "Phòng ban 1 - ACCOUNTING", "NEW YORK");
        PhongBan1.addEmployee(new Emp(7782, "CLARK", "MANAGER", "6/9/1981", 2450.00f));
        PhongBan1.addEmployee(new Emp(7839, "KING", "PRESIDENT", "11/17/1981", 5000.00f));
        PhongBan1.addEmployee(new Emp(7934, "MILLER", "CLERK", "6/9/1981", 1300.00f));

        //
        Dept PhongBan2 = new Dept(20, "Phòng ban 2 - RESEARCH", "DALLAS");
        PhongBan2.addEmployee(new Emp(7369, "SMITH", "CLERK", "12/17/1980", 800.00f));
        PhongBan2.addEmployee(new Emp(7788, "SCOTT", "ANALYST", "4/19/1987", 3000.00f));
        PhongBan2.addEmployee(new Emp(7876, "ADAMS", "CLERK", "5/23/1987", 1100.00f));
        PhongBan2.addEmployee(new Emp(7876, "FORD", "ANALYST", "12/3/1981", 3000.00f));
        PhongBan2.addEmployee(new Emp(7566, "JONES", "MANAGER", "4/2/1981", 2975.00f));
        //
        //
        Dept PhongBan3 = new Dept(30, "Phòng ban 3 - SALES", "CHICAGO");
        PhongBan3.addEmployee(new Emp(7654, "MARTIN", "SALESMAN", "9/28/1981", 1250.00f));
        PhongBan3.addEmployee(new Emp(7499, "ALLEN", "SALESMAN", "2/20/1981", 1600.00f));
        PhongBan3.addEmployee(new Emp(7521, "WARD", "SALESMAN", "2/22/1981", 1250.00f));
        PhongBan3.addEmployee(new Emp(7844, "TURNER", "SALESMAN", "9/8/1981", 1500.00f));
        PhongBan3.addEmployee(new Emp(7900, "JAMES", "CLERK", "12/3/1981", 950.00f));
        //
        Dept PhongBan4 = new Dept(40, "Phòng ban 4 - OPERATIONS", "BOSTON");
        //
        DEPARTMENTS.add(PhongBan1);
        DEPARTMENTS.add(PhongBan2);
        DEPARTMENTS.add(PhongBan3);
        DEPARTMENTS.add(PhongBan4);
    }
    // Truy vấn bảng Department.
    public static List<Dept> queryDepartments() {
        return DEPARTMENTS;
    }
    // Truy vấn bảng Employee.
    // Lấy ra danh sách các nhân viên của 1 phòng ban.
    public static Set<Emp> queryEmployees(int deptNo) {
        for (Dept dept : DEPARTMENTS) {
            if (deptNo == dept.getDeptNo()) {
                return dept.getEmployees();
            }
        }
        return null;
    }

}
