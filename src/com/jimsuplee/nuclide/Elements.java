/**Copyright (C) 2013 Thomas Maher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.jimsuplee.nuclide;

import java.util.ArrayList;
import java.util.List;
import android.app.ListActivity;
//import android.app.Activity;
import android.content.Intent;
import android.widget.ListView;
import android.widget.ArrayAdapter;
//import java.util.ArrayList;
//import java.util.List;
import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.net.Uri;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;

//import android.util.Log;

public class Elements extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		displayListView();
	}

	private void displayListView() {
		List<String> nuclideList = new ArrayList<String>();
		// nuclideList.add("H");

		nuclideList.add("actinium       89  Ac");
		nuclideList.add("silver         47  Ag");
		nuclideList.add("aluminum       13  Al");
		nuclideList.add("americium      95  Am");
		nuclideList.add("argon          18  Ar");
		nuclideList.add("arsenic        33  As");
		nuclideList.add("astatine       85  At");
		nuclideList.add("gold           79  Au");
		nuclideList.add("barium         56  Ba");
		nuclideList.add("beryllium      4   Be");
		nuclideList.add("bohrium        107 Bh");
		nuclideList.add("bismuth        83  Bi");
		nuclideList.add("berkelium      97  Bk");
		nuclideList.add("boron          5   B");
		nuclideList.add("bromine        35  Br");
		nuclideList.add("calcium        20  Ca");
		nuclideList.add("cadmium        48  Cd");
		nuclideList.add("cerium         58  Ce");
		nuclideList.add("californium    98  Cf");
		nuclideList.add("chlorine       17  Cl");
		nuclideList.add("curium         96  Cm");
		nuclideList.add("carbon         6   C");
		nuclideList.add("cobalt         27  Co");
		nuclideList.add("chromium       24  Cr");
		nuclideList.add("cesium         55  Cs");
		nuclideList.add("copper         29  Cu");
		nuclideList.add("dubnium        105 Db");
		nuclideList.add("darmstadtium   110 Ds");
		nuclideList.add("dysprosium     66  Dy");
		nuclideList.add("erbium         68  Er");
		nuclideList.add("einsteinium    99  Es");
		nuclideList.add("europium       63  Eu");
		nuclideList.add("iron           26  Fe");
		nuclideList.add("fermium        100 Fm");
		nuclideList.add("fluorine       9   F");
		nuclideList.add("francium       87  Fr");
		nuclideList.add("gallium        31  Ga");
		nuclideList.add("gadolinium     64  Gd");
		nuclideList.add("germanium      32  Ge");
		nuclideList.add("helium         2   He");
		nuclideList.add("hafnium        72  Hf");
		nuclideList.add("mercury        80  Hg");
		nuclideList.add("hydrogen       1   H");
		nuclideList.add("holmium        67  Ho");
		nuclideList.add("hassium        108 Hs");
		nuclideList.add("iodine         53  I");
		nuclideList.add("indium         49  In");
		nuclideList.add("iridium        77  Ir");
		nuclideList.add("potassium      19  K");
		nuclideList.add("krypton        36  Kr");
		nuclideList.add("lanthanum      57  La");
		nuclideList.add("lithium        3   Li");
		nuclideList.add("lawrencium     103 Lr");
		nuclideList.add("lutetium       71  Lu");
		nuclideList.add("mendelevium    101 Md");
		nuclideList.add("magnesium      12  Mg");
		nuclideList.add("manganese      25  Mn");
		nuclideList.add("molybdenum     42  Mo");
		nuclideList.add("meitnerium     109 Mt");
		nuclideList.add("sodium         11  Na");
		nuclideList.add("niobium        41  Nb");
		nuclideList.add("neodymium      60  Nd");
		nuclideList.add("neon           10  Ne");
		nuclideList.add("nickel         28  Ni");
		nuclideList.add("nitrogen       7   N");
		nuclideList.add("nobelium       102 No");
		nuclideList.add("neptunium      93  Np");
		nuclideList.add("oxygen         8   O");
		nuclideList.add("osmium         76  Os");
		nuclideList.add("protactinium   91  Pa");
		nuclideList.add("lead           82  Pb");
		nuclideList.add("palladium      46  Pd");
		nuclideList.add("promethium     61  Pm");
		nuclideList.add("phosphorus     15  P");
		nuclideList.add("polonium       84  Po");
		nuclideList.add("praseodymium   59  Pr");
		nuclideList.add("platinum       78  Pt");
		nuclideList.add("plutonium      94  Pu");
		nuclideList.add("radium         88  Ra");
		nuclideList.add("rubidium       37  Rb");
		nuclideList.add("rhenium        75  Re");
		nuclideList.add("rutherfordium  104 Rf");
		nuclideList.add("roentgenium    111 Rg");
		nuclideList.add("rhodium        45  Rh");
		nuclideList.add("radon          86  Rn");
		nuclideList.add("ruthenium      44  Ru");
		nuclideList.add("antimony       51  Sb");
		nuclideList.add("scandium       21  Sc");
		nuclideList.add("selenium       34  Se");
		nuclideList.add("seaborgium     106 Sg");
		nuclideList.add("silicon        14  Si");
		nuclideList.add("samarium       62  Sm");
		nuclideList.add("sulfur         16  S");
		nuclideList.add("tin            50  Sn");
		nuclideList.add("strontium      38  Sr");
		nuclideList.add("tantalum       73  Ta");
		nuclideList.add("terbium        65  Tb");
		nuclideList.add("technetium     43  Tc");
		nuclideList.add("tellurium      52  Te");
		nuclideList.add("thorium        90  Th");
		nuclideList.add("titanium       22  Ti");
		nuclideList.add("thallium       81  Tl");
		nuclideList.add("thulium        69  Tm");
		nuclideList.add("uranium        92  U");
		nuclideList.add("ununbium       112 Uub");
		nuclideList.add("ununhexium     116 Uuh");
		nuclideList.add("ununoctium     118 Uuo");
		nuclideList.add("ununpentium    115 Uup");
		nuclideList.add("ununquadium    114 Uuq");
		nuclideList.add("ununseptium    117 Uus");
		nuclideList.add("ununtrium      113 Uut");
		nuclideList.add("vanadium       23  V");
		nuclideList.add("tungsten       74  W");
		nuclideList.add("xenon          54  Xe");
		nuclideList.add("ytterbium      70  Yb");
		nuclideList.add("yttrium        39  Y");
		nuclideList.add("zinc           30  Zn");
		nuclideList.add("zirconium      40  Zr");

		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				R.layout.locationtextview, nuclideList);
		setListAdapter(dataAdapter);
		ListView listView = getListView();
		// filtering  ListView
		listView.setTextFilterEnabled(true);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i = new Intent("");
				String nuclideChoice = ((TextView) view).getText().toString();
				i.setData(Uri.parse(nuclideChoice));
				setResult(RESULT_OK, i);
				finish();
			}
		});
	}
}
