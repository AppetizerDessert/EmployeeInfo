package c346.rp.edu.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> EmployeeList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);
        EmployeeList = new ArrayList<>();

        EmployeeList.add(new Employee("John", "Software Technical Leader", 3400.0));
        EmployeeList.add(new Employee("May", "Programmer", 2200.0));

        adapter = new CustomAdapter(this, R.layout.row, EmployeeList);

        lvEmployee.setAdapter(adapter);

    }
}
