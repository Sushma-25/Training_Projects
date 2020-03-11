import com.sushma.Misc.ProtectedDemoCheckClass;

public class protectedAccessDemo {
public static void main(String[] args) {
	ProtectedDemoCheckClass chk=new ProtectedDemoCheckClass();
	//chk.chechData();
	
	CheckExtension c=new CheckExtension();
	ProtectedDemoCheckClass ck=new CheckExtension();
	c.checkData();
	
	
}
}
class CheckExtension extends ProtectedDemoCheckClass{

	@Override
	protected void checkData() {
		System.out.println("CheckExtension.checkData()");
		super.checkData();
	}
}