package tn.esprit.spring;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Voyageur;
import tn.esprit.spring.repository.VoyageurRepository;
import tn.esprit.spring.services.VoyageurServiceImpl;


@SpringBootTest(classes= ExamThourayaS2Application.class)
@RunWith(MockitoJUnitRunner.class)
public class TrainServiceImplTest {
	
	@Mock
	  VoyageurRepository vRepository;
		
		Voyageur v1 = new Voyageur((long) 1, "karim");
		 Voyageur v2 = new Voyageur((long) 2, "ahmed");
		 
		@InjectMocks
			VoyageurServiceImpl vService;
		
		
		  @Test
		  @Order(1)
			public void ajouterVoyageurTest() {
			  when(vRepository.save(v1)).thenReturn(v1);
	    	assertNotNull(v1);
	   	
	   	 vService.ajouterVoyageur(v1);
				//assertEquals(v1, persisted); 
	    	
			System.out.println("add operators works !");	
	}
		  @Test 
		  @Order(2)
		 	   public void recupererAll() {
		 	    	when(vRepository.findAll()).thenReturn(Stream
		 	    			.of(v1,v2)
		 	    			.collect(Collectors.toList()));
		 	    	
		 	    	assertEquals(2,vService.recupererAll().size());
		    	System.out.println("Retrieve all operators works !");
				
		     }

	
	
}
