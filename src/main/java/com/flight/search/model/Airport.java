
package com.flight.search.model;

import java.util.Objects;

public class Airport {
	private String iataCode;
	private String terminal;
	private String at;

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	@Override
	public String toString() {
		return "Airport [iataCode=" + iataCode + ", terminal=" + terminal + ", at=" + at + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(at, other.at) && Objects.equals(iataCode, other.iataCode)
				&& Objects.equals(terminal, other.terminal);
	}

}
