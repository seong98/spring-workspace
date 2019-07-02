package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.등록 4.수정 5.삭제 6.고객검색 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customers = customerDao.getAllCustomers();
				for(Customer c :customers) {
					System.out.println("번호: " + c.getNo());
					System.out.println("이름: " + c.getName());
					System.out.println("전화번호: " + c.getPhone());
				}
			} else if (menu == 2) {
				System.out.println("회원번호 입력 : ");
				int no = scanner.nextInt();
				Customer c = customerDao.getCustomerByNo(no);
				System.out.println("번호: " + c.getNo());
				System.out.println("이름: " + c.getName());
				System.out.println("닉네임: " + c.getNickName());
				System.out.println("이메일: " + c.getEmail());
				System.out.println("전화번호: " + c.getPhone());
				System.out.println("도시: " + c.getCity());
				System.out.println("포인트: " + c.getPoint());
				System.out.println("등록일: " + c.getCreateDate());
			} else if (menu == 3) {
				
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("닉네임 입력");
				String nickname = scanner.next();
				System.out.println("이메일 입력");
				String email = scanner.next();
				System.out.println("전화번호 입력");
				String phone = scanner.next();
				System.out.println("도시입력");
				String city = scanner.next();
				System.out.println("포인트 입력");
				int point = scanner.nextInt();
				Customer c = new Customer();
				c.setName(name);
				c.setNickName(nickname);
				c.setEmail(email);
				c.setPhone(phone);
				c.setCity(city);
				c.setPoint(point);
				
				customerDao.insertCustomer(c);
				System.out.println("등록 완료");
			} else if (menu == 4) {
				System.out.println("번호입력");
				Customer c = new Customer();
				int no = scanner.nextInt();
				System.out.println("닉네임 입력 : ");
				String nickname = scanner.next();
				System.out.println("이메일 입력 : ");
				String email = scanner.next();
				System.out.println("전화번호 입력 : ");
				String phone = scanner.next();
				System.out.println("도시 입력 : ");
				String city = scanner.next();
				System.out.println("포인트 입력 : ");
				int point = scanner.nextInt();
				
				c.setNo(no);
				c.setNickName(nickname);;
				c.setEmail(email);
				c.setPhone(phone);
				c.setCity(city);
				c.setPoint(point);
				
				customerDao.updateCustomer(c);
				
				System.out.println("변경완료");
				
			} else if (menu == 5) {
				System.out.println("번호입력 : ");
				int no = scanner.nextInt();
				customerDao.deleteCustomer(no);
				
			} else if(menu == 6) {
				Map<String, Object> map = new HashMap<String, Object>();
				
				System.out.println("번호, 이름, 닉네임");
				System.out.println("키워드 입력 : ");
				String sort = scanner.next();
				
				if(sort.equals("번호")) {
					System.out.println("회원번호 입력 : ");
					int cuNo = scanner.nextInt();
					map.put("sort", sort);
					map.put("keyword", cuNo);
					
					Customer c = customerDao.searchCustomerByOption(map);
					System.out.println("번호: " + c.getNo());
					System.out.println("이름: " + c.getName());
					System.out.println("닉네임: " + c.getNickName());
					System.out.println("이메일: " + c.getEmail());
					System.out.println("전화번호: " + c.getPhone());
					System.out.println("도시: " + c.getCity());
					System.out.println("포인트: " + c.getPoint());
					System.out.println("등록일: " + c.getCreateDate());
				} else {
					System.out.println("이름이나 닉네임을 입력 : ");
					String keyword = scanner.next();
					map.put("sort", sort);
					map.put("keyword", keyword);
					
					Customer c = customerDao.searchCustomerByOption(map);
					System.out.println("번호: " + c.getNo());
					System.out.println("이름: " + c.getName());
					System.out.println("닉네임: " + c.getNickName());
					System.out.println("이메일: " + c.getEmail());
					System.out.println("전화번호: " + c.getPhone());
					System.out.println("도시: " + c.getCity());
					System.out.println("포인트: " + c.getPoint());
					System.out.println("등록일: " + c.getCreateDate());
				}
				
				
			}
			else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
