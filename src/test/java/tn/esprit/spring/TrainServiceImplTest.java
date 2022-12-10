//package tn.esprit.spring;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Order;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import tn.esprit.spring.ExamThourayaS2Application;
//import tn.esprit.spring.entities.Train;
//import tn.esprit.spring.entities.etatTrain;
//import tn.esprit.spring.repository.TrainRepository;
//import tn.esprit.spring.services.TrainServiceImpl;
//
//
//@SpringBootTest(classes= ExamThourayaS2Application.class)
//@RunWith(MockitoJUnitRunner.class)
//public class TrainServiceImplTest {
//	
//	@Mock
//	  TrainRepository TrainRepository;
//		
//		Train Train1 = new Train(1, "prevu" , 100);
//		 Train Train2 = new Train(2, "prevu" , 200);
//		@InjectMocks
//			TrainServiceImpl TrainService;
//		
//		
//		  @Test
//		  @Order(1)
//			public void addTrainTest() {
//			  when(TrainRepository.save(Train1)).thenReturn(Train1);
//	    	assertNotNull(Train1);
//	   	
//	   	Train persisted = TrainService.ajouterTrain(Train1);
//				assertEquals(Train1, persisted); 
//	    	
//			System.out.println("add operators works !");
//	}
//
//	
//	
//}
