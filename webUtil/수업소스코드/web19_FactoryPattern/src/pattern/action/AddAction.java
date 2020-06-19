/*
 *  AddAction ::
 *  컴포넌트
 *  
 *  인터페이스 기반으로 작성된 재사용성이 강한 자바클래스
 */
package pattern.action;

public class AddAction implements Action{
	@Override
	public String execute() {
		/*
		 * 1. 폼값 받아서
		 * 2. DAO 리턴받고
		 * 3. biz 로직 호출
		 * 4. 리턴된 값 바인딩
		 * 5. path를 최종적으로 리턴
		 */
		
		return "add_result.jsp";
		
	}	
}







