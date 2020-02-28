package entities;

public class Empresa extends Contribuentes {

		private Integer Numerofunc;
		
		public Empresa() {
			super();
		}

		public Empresa(String name, Double anual_income, Integer numerofunc) {
			super(name, anual_income);
			Numerofunc = numerofunc;
		}

		public Integer getNumerofunc() {
			return Numerofunc;
		}

		public void setNumerofunc(Integer numerofunc) {
			Numerofunc = numerofunc;
		}

		@Override
		public double taxa() {
			if(Numerofunc > 10 ) {
				return getAnual_income() * 0.14;
			}
			
			else {
				return getAnual_income() * 0.16;
			}
		}
		
}

