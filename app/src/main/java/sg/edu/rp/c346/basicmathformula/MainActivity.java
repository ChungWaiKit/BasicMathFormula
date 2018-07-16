package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;

    ArrayList<Mathformula> alMathFormula;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lvMath = findViewById(R.id.ListViewMath);

        alMathFormula = new ArrayList<>();
        Mathformula emp1 = new Mathformula("Area Of rectangle", "Length x Length", "Area");
        Mathformula emp2 = new Mathformula("Area of triangle", "(Length of base x Length)/2", "Area");
        Mathformula emp3 = new Mathformula("Volume of cube", "Length x Length X Length", "Volume");

        alMathFormula.add(emp1);
        alMathFormula.add(emp2);
        alMathFormula.add(emp3);


        caMath = new CustomAdapter(this,R.layout.math_formula,alMathFormula );

        lvMath.setAdapter(caMath);
    }
}
