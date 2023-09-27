//package interview.DemoRestApi.Entity;
//import java.util.List;
//
////ENTITY CLASS
//@Entity
//public class Record {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    // Constructors, getters, and setters
//}
//
//
////REPOSITORY
//public interface RecordRepository extends JpaRepository<Record, Long> {
//}
//
//
////CONTROLLER
//@RestController
//@RequestMapping("/api/records")
//public class RecordController {
//
//    @Autowired
//    private RecordRepository recordRepository;
//
//    @GetMapping
//    public List<Record> getAllRecords() {
//        return recordRepository.findAll();
//    }
//}
