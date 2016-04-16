@Controller
public class sampleController {
@RequestMapping("/")
public String printMsg()
{
	return "index";
}
}
