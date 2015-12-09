package az.ivytech.vugar;

public class ConvertToHyperlink {

	public static void main(String[] args) {
		String myString = "hello bro please share this link https://test.test.net/issues/?jql=project%20%3D%20AL%20AND%20status%20in%20(%22In%20Progress%22%2C%20%22To%20Do%22%2C%20%22In%20Review%22)%20AND%20assignee%20in%20(currentUser())%20ORDER%20BY%20updated%20DESC thank you very much!";
		System.out.println(myString.replaceAll("(?:https|http)://[\\w/%.-]+([^\\s\\|]+)", "<a href=\"$0\">$1</a>"));

	}

}
