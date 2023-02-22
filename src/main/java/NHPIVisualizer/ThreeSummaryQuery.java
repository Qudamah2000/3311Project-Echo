package NHPIVisualizer;


public class ThreeSummaryQuery implements Query {

	private String selection1;
	private String selection2;
	private String selection3;
	private String startDate;
	private String endDate;
	
	public ThreeSummaryQuery(String selection1, String selection2, String selection3, String startDate, String endDate) {
		this.selection1 = selection1;
		this.selection2 = selection2;
		this.selection3 = selection3;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getQuery() {
		
		System.out.println("SELECT * FROM (SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection1 + " Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate +"\")) AS A,\r\n"
				+ "(SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection2 +" Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS B,\r\n"
				+ "(SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection3 +" Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS C,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection1 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS D,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection2 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS E,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection3 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS F,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection1 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS G,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection1 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS H,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection2 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS I,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection2 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS J,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection3 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS K,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection3 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS L;");
		
		return "SELECT * FROM (SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection1 + " Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate +"\")) AS A,\r\n"
				+ "(SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection2 +" Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS B,\r\n"
				+ "(SELECT FORMAT(AVG(VALUE), 2) AS \"" + selection3 +" Average\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS C,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection1 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS D,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection2 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS E,\r\n"
				+ "(SELECT FORMAT(STDDEV(VALUE), 2) AS \"" + selection3 + " Standard Deviation\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS F,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection1 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS G,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection1 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection1 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS H,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection2 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS I,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection2 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection2 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS J,\r\n"
				+ "(SELECT MIN(VALUE) AS \"" + selection3 + " Min\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS K,\r\n"
				+ "(SELECT MAX(VALUE) AS \"" + selection3 + " Max\" FROM echodata.echodata WHERE (GEO LIKE \"%" + selection3 + "%\") AND (REF_DATE <= \"" + endDate + "\" AND REF_DATE >= \"" + startDate + "\")) AS L;";
		
	}
}