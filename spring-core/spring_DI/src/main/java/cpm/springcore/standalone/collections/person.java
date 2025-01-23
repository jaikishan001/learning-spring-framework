package cpm.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {

	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties props;   //this is properties class
	
	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	
	
//	public person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}

	

	
	//constructor use nhi kia kyuki property injection karenge
	
	
	
	
}
