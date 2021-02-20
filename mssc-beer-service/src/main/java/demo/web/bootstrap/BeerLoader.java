package demo.web.bootstrap;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.web.domain.Beer;
import demo.web.repositories.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {

	@Autowired
	private BeerRepository beerRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		loadBeerObjects();
	}

	private void loadBeerObjects() {
		if (beerRepository.count() == 0) {
			beerRepository.save(Beer.builder().beerName("Kingfihser").beerStyle("IPA").quantityToBrew(200)
					.upc(313126621L).price(new BigDecimal("10.00")).build());

			beerRepository.save(Beer.builder().beerName("Budweiser").beerStyle("ITC").quantityToBrew(100).upc(31317721L)
					.price(new BigDecimal("20.00")).build());
		}

		System.out.println("Loaded Beers:" + beerRepository.count());

	}
	// Runs everytime Spring context starts

}
