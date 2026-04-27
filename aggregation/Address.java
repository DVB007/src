package aggregation;

//create one class for manage variable city and country
public class Address {
    // Instant variable
    String city, country;

    //Constructor (វាស្រដៀងនឹង Method ដែរ តែឈ្មោះដូច Class)។
    // គេប្រើវាសម្រាប់ ផ្ដល់តម្លៃដំបូង ទៅឲ្យ Object នៅពេលយើងបង្កើតវា
    // (ប្រើពាក្យ new)។ បើគ្មានវាទេ យើងពិបាកនឹងដាក់ឈ្មោះទីក្រុង ឬប្រទេសឲ្យ
    // Object Address ណាស់
    public Address(String city, String country) {
        //this ប្រើសម្រាប់សំដៅលើ Variable របស់ Class (Instance Variable)។
        // គេប្រើវាដើម្បីបង្ការការភាន់ច្រឡំ នៅពេលដែលឈ្មោះ Variable របស់ Class
        // និងឈ្មោះ Parameter របស់ Method ដូចគ្នា
        this.city = city;//assign new value of parameter to instant variable
        this.country = country;
    }
}
