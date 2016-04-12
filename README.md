### Nuclides Android App README

Code for Nuclides android application.

Nuclides for every element.  

Basic information and naturally occurring isotopes are shown in green. 

Other isotopes are shown below in red.

The nuclide information is stuffed into a data structure when the application is started on the phone.  This snippet of code shows the creation of this data structure:
```{java}
public class Nuclides extends Activity {
        static final String TAG = "NUCLIDES";
        HashMap<String, String> nuclideMap = new HashMap<String, String>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_nuclides);
                // displayListView();

                nuclideMap
                                .put("actinium       89  Ac",
                                                "                                     89-Ac\n                                  89-actinium\n\nIsotopes:\nAc-207   Ac-208   Ac-209   Ac-210   Ac-211   Ac-212   Ac-213   Ac-214   Ac-\n215   Ac-216   Ac-217   Ac-218   Ac-219   Ac-220   Ac-221   Ac-222   Ac-223  \nAc-224   Ac-225   Ac-226   Ac-227   Ac-228   Ac-229   Ac-230   Ac-231   Ac-\n232   Ac-233   Ac-234   Ac-235   Ac-236  \n-------------------------------------------------------------------------------\n");
                nuclideMap
                                .put("silver         47  Ag",
                                                "                                     47-Ag\n                                   47-silver\nNaturally occuring isotopes:\nAg-107   ( 51.839% ) Ag-109   ( 48.161% )\nIsotopes:\nAg-94   Ag-95   Ag-96   Ag-97   Ag-98   Ag-99   Ag-100   Ag-101   Ag-102   Ag-\n103   Ag-104   Ag-105   Ag-106   Ag-108   Ag-110   Ag-111   Ag-112   Ag-113  \nAg-114   Ag-115   Ag-116   Ag-117   Ag-118   Ag-119   Ag-120   Ag-121   Ag-\n122   Ag-123   Ag-124   Ag-125   Ag-126   Ag-127  \n-------------------------------------------------------------------------------\n");
```
When the user chooses an element, the data is already available for display.
