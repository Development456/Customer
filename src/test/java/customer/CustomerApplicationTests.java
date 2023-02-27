package customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.miracle.customer.repository.CustomerRepository;
import com.miracle.customer.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerApplicationTests {
	
	@Autowired
	CustomerServiceImpl service;
	
	@MockBean
	CustomerRepository repository;
	
	
//	public void getAllCustomersTest(){
//		when(repository.findAll()).thenReturn(Stream
//				.of("876 Reindahl Pass","Oak Valley","85750","Tulsa","USA","25-Aug-20","4-Jan-22","POCSLV","1","bloudyan0@taobao.com","9084923588","POCSLV", "Pixope", "918-205-9582", "74156", "OK", "MT59351").collect(Collectors.toList()));
//	}
	
	
	
	
	
}


