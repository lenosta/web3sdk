package org.bcos.web3j.protocol.core.methods.response;

import java.math.BigInteger;

import org.bcos.web3j.protocol.core.Response;
import org.bcos.web3j.utils.Numeric;

/**
 * eth_gasPrice.
 */
public class EthGasPrice extends Response<String> {
    public BigInteger getGasPrice() {
        return Numeric.decodeQuantity(getResult());
    }
}
