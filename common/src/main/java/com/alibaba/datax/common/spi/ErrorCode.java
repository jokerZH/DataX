package com.alibaba.datax.common.spi;

/* 尤其注意：最好提供toString()实现 */
public interface ErrorCode {
	// 错误码编号
	String getCode();

	// 错误码描述
	String getDescription();

	/** 必须提供toString的实现
	 * 
	 * @Override
	 * public String toString() {
	 * 	return String.format("Code:[%s], Description:[%s].", this.code, this.describe);
	 * }
	 */
	String toString();
}
