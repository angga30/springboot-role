package pretest.angga.pretest.dto;

public class dtoemp {
	private String order;
	private String ModuleName;

	
	public dtoemp(String order, String ModuleName) {
		this.order = order;
		this.ModuleName = ModuleName;

}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
}