package demo.web.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.web.model.BeerDto;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
		return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Object> saveNewBeer(@Valid @RequestBody BeerDto beerdto) {
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/{beerId}")
	public ResponseEntity<Object> updateBeerById(@PathVariable UUID beerId, @Valid @RequestBody BeerDto beerdto) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
