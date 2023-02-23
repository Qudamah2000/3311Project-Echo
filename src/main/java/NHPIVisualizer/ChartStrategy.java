package NHPIVisualizer;

import java.sql.ResultSet;

public interface ChartStrategy {
	void drawChartFor2Series(ResultSet result, String selection1, String selection2, String type);
	void drawChartFor3Series(ResultSet result, String selection1, String selection2, String selection3, String type);
}
