package calcV;

/**
 * Created by Denni on 9/29/2016.
 */
public enum  OperationType {
    PLUS {
        @Override
        public String doOperation(OperationWrapper wrapper) {
            return "" + (wrapper.getX() + wrapper.getY());
        }
    },
    MINUS {
        @Override
        public String doOperation(OperationWrapper wrapper) {
            return null;
        }
    },
    DIVIDE {
        @Override
        public String doOperation(OperationWrapper wrapper) {
            return null;
        }
    },
    MULTIPLY {
        @Override
        public String doOperation(OperationWrapper wrapper) {
            return null;
        }
    },
    SQRT {
        @Override
        public String doOperation(OperationWrapper wrapper) {
            return "" + Math.sqrt(wrapper.getX());
        }
    };

    public abstract String doOperation(OperationWrapper wrapper);

}
