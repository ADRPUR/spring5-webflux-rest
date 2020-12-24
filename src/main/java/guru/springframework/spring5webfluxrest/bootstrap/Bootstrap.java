package guru.springframework.spring5webfluxrest.bootstrap;

import guru.springframework.spring5webfluxrest.domain.Category;
import guru.springframework.spring5webfluxrest.domain.Vendor;
import guru.springframework.spring5webfluxrest.repositories.CategoryRepository;
import guru.springframework.spring5webfluxrest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Bootstrap implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(categoryRepository.count().block() == 0){
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            categoryRepository.save(Category.builder()
                        .description("Fruits").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Nuts").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Breads").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Meats").build()).block();

            categoryRepository.save(Category.builder()
                    .description("Eggs").build()).block();

            System.out.println("Loaded Categories: " + categoryRepository.count().block());

            vendorRepository.save(Vendor.builder()
                        .firstName("Adrian")
                        .lastName("Purice").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Igor")
                    .lastName("Cocier").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Victoria")
                    .lastName("Morosan").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Tatiana")
                    .lastName("Rudic").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Eugeniu")
                    .lastName("Burlac").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Mircea")
                    .lastName("Grosu").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Victoria")
                    .lastName("Grosu").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Victor")
                    .lastName("Bidiuc").build()).block();

            vendorRepository.save(Vendor.builder()
                    .firstName("Natalia")
                    .lastName("Ginju").build()).block();

            System.out.println("Loaded Vendors: " + vendorRepository.count().block());

        }



    }
}
