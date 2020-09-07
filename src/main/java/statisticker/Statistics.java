package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics{

    static class Stats {

        public Float min = Float.NaN;

        public Float max = Float.NaN;

        public Float average = Float.NaN;

    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics.Stats s = new Statistics.Stats();
        float sum = 0.0f;

        if(!numbers.isEmpty()) {
            s.min = Collections.min(numbers);
            s.max = Collections.max(numbers);
            for(float no: numbers) {
                sum += no;
            }
            s.average =(Float)sum/numbers.size();
        }

        return s;
    }
}
